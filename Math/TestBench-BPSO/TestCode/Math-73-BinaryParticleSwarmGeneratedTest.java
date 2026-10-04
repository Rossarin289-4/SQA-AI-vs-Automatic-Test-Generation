package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-1.7976931348623157E308", "2.0000000000000004", "0.7849999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:3>", "-2.29", "7694577816772532779"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "10.000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=10.000000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-78.35000000000001", "-9.999999999999997E-7"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-2.1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-44.215", "1.7976931348623157E308", "9.999999999999997E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-78.35000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-2.1, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-49.0", "27.57", "-2.0999999999999996"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "-3.9999999999999996", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0999999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.0999999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-2.2840000000000003"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-1.0", "1.8200000000000003", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.2840000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-2.2840000000000003, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.2133334118...#207#430699766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "4.9E-324"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.9529999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.9529999999999998, getIterationCount=0, getMaximalIterationCount=1073741823, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "NaN", "0.25"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "0.25", "1.0", "-0.39999949999999995"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-65.06", "Infinity", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "7694577816772532779", "1.0", "1.953"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-65.06}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "1.0E-6", "40.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "2.0", "-6.340000000000001", "3.906"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-7.99999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-39.06", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-7.99999, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.26999900000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "5.0", "-39.06", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.26999900000000004, getFunctionValue=-39.06, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "1.495", "-6.599999999999999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "3.906", "-68.06"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-0.049999499999999975", "1.7976931348623157E308", "-0.1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-3.9999999999999996"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.9999999999999996, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.9999999999999998"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.9999999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.6945778167725332E18"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.1953", "2147483639"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483639, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.1953}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-9.999999999999997E-7", "-39.06", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.9520000000000002"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.9520000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-13.46", "<sample:4>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.04699999999999993", "3"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-6.679", "4.9E-324", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.04699999999999993}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.0", "1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "3.906", "18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.906, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-6.7299999999999995", "1.953", "10"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.953, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-6.7299999999999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "-4.0", "2147483647"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-4.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"25.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=25.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.39999949999999995", "-1.9999999999999995E-5", "-3"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9999999999999995E-5, getFunctionValueAccuracy=1.0E-15, getIterationCount=-3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.39...#216#1687508176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-Infinity", "7.812", "-2147483624"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.812, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483624, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-20.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-20.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "1.7976931348623155E308", "5.0"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"23.0", "-0.799999", "-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.799999, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=23.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.9999999999999998E-5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.9999999999999998E-5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-24.660000000000004", "3.1530000000000005"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-200.0", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-200.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.025", "-2147483648"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.025}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "3.8472889083862666E18", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"39.1", "3"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=39.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-2.0", "-2.0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.4099999999999997"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.4099999999999997, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "9.999999999999997E-7", "-14"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-14, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999999999997E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-390.6"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-390.6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-Infinity", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8200000000000003", "7694577816772532779"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-3.906"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.906, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-2.54", "-2147483648"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-3.0", "1.9999999999999995E-6", "2.09"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-6.73", "1.5"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.73", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-5"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-5, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-100.06", "2.051"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.06", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.5", "-1.0", "1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.7976931348623157E308", "1.57", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.03999995", "NaN", "-4.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-19.53", "-2"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-19.53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.953", "4.01"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.1", "1.5700000000000003", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-0.25", "-1.0", "1.0E-6"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-2.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-4.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-1.953", "1.5", "1.57"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623158E307, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.5", "-0.9999999999999999", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-15.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-8.0", "-8.0", "0.044"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-15.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.3529999999999998"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "5.0E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.3529999999999998, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=5.0E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.505"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "4.0", "1.0", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.505, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.953", "15.700000000000001", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "2.0", "NaN", "77"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=77, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.3999995"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "-6.73", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.3999995, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "5.57", "-1.9530000000000003", "-0.3499995"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"4.999999999999999", "0.49", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.49, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "NaN", "-39.06"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-77.7", "-39.06", "-4.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.5", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-39.06"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-39.06, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-16"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-7.6945778167725322E18", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-16, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"7.694577816772533E19", "-1.7976931348623157E308", "-1"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.7976931348623157E308", "0.5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.69...#217#1516973481", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-134217727"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-134217727, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-4.0", "1.57", "1.7976931348623155E308"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "50.6000005", "Infinity", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=50.6000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"3.906"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "0.0", "1.8200000000000003"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.906, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.9999999999999998E-5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.9999999999999998E-5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "10.0", "39.06"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "5.2700000000000005", "67108865"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=67108865, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.2700000000000005...#201#-1041575810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.073", "-16378"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-16378, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.073}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.722", "-34.56", "-45"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-34.56, getFunctionValueAccuracy=1.0E-15, getIterationCount=-45, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.722}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.57"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.9999999999999999", "1.7976931348623157E308", "-1056964608"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.7976931348623157E308, getFunctionValueAccuracy=1.57, getIterationCount=-1056964608, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#220#557631832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-2.0", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "17.76", "3.906"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-4.0", "1.9529999999999998", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.9529999999999998, getFunctionValueAccuracy=1.0E-15, getIterationCount=5, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-32.660000000000004", "NaN", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-32.660000000000...#204#905208625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-14.0", "-9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-9, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-14.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.75", "3.6400000000000006"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "7.1000000000000005", "-0.39999949999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "5.0E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0E-7, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0", "0.5000000000000001", "27"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5000000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.5", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"20.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=20.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"3.14", "3"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "Infinity", "-1.89", "1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.57", "Infinity", "-9.999999999999997E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.9999999999999998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-0.109999", "1.8200000000000003"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.053001", "-1.0E-6", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.053001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.556", "19.000001", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-4.0", "52.047", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "1.0E-6", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.673"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.673, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.39999949999999995"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.39999949999999995, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-253"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-253, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-4.999999999999999E-7"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-4.999999999999999E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "9.999999999999997E-7", "-1.9000000000000004", "-55"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=-55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.99999...#214#1872242503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "3.906", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.906}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2097156"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2097156, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-9.82", "0.34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.82", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.5330000000000001", "-9.999999999999997E-7"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "0.9100000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5330000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.9100000000000001, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.953"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.953", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.953, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.953"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.953, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-0.3999995", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.3999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.8000000000000003"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-39.06", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-1.8000000000000003, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-39.06}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.6399980000000001", "0.34"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6399980000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.5", "-2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.9100000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9100000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.9100000000000001, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"39.06", "0.785", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.0", "-4.0", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-4.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.9999999999999998", "-3.1399999999999997", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.1399999999999997, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#221#-546023148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "4.0", "-1.9999999999999998", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9999999999999998, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-6.0", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-39.059999999999995", "-3.9999999999999996"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "9.820000000000002"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=9.820000000000002, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-6.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-0.024999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.024999, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.7849999999999999", "0.96"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7849999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "4.17", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.7976931348623153E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623153E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.9999999999999996", "-2147483648"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.999999999999...#205#-1508925089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-2.0E-6", "-9.999999999999997E-7", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.95", "-1.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-9.999999999999997E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.0E-6...#201#-401903951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"39.06"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=39.06, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.2, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "39.116", "-55"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=39.116}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.1", "1.57", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-6.7299999999999995"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-6.7299999999999995, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "7694577816772532779"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-6.730000000000001", "Infinity", "1.5699999999999998"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-4.999999999999999E-7", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "139.39999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("139.39999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=139.39999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.9530000000000003", "4194304"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194304", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=4194304, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.9530000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.39999999999999997"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.39999999999999997, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.5389155633545066E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5389155633545066E19, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-9.82", "-1.7976931348623155E308", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-1.7976931348623157E308", "1.57", "1.5699999999999998"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623155E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-9.8...#202#-1447347633", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-78.12", "-2.0", "-10"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-19.999999999999993", "1.8200000000000003"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-78.12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-4.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.953", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.9765"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.953", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.9765, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.7849999999999999", "1.7976931348623155E308", "1.57"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-39.06"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-39.06, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.7700000000000005"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.7700000000000005, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "20"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-9.82", "7694577816772532779", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=20, getRelativeAccuracy=1.0E-14, getResult=-9.82}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0E-6", "1073741834"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741834, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.39999949999999995"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.39999949999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.39999949999999995, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "2.4500000000000006", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "-1.953", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.4500000000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-20.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "40.000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=40.000005, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "21"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "11.906"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=11.906, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0E-6", "0.785", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-19.64", "2.0000000000000004", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.0000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-19.64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.5000000000000002", "0.39249999999999996", "2147483647"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.39249999999999996, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#219#1948494898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"20.000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-25.5", "8195"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=20.000000000000004, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=8195, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-25.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-38.3", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-38.3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-1.4300000000000002", "1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483615"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483615, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.27999999999999997", "0.7812"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.27999999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.5699999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-39.06", "0.019000000000000003", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5699999999999998, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "27"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=27, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=2.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.57"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.57, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.935", "1.8200000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "2.000000000000001", "-2.0", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.953", "6.17"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.953", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "9.82", "3.05", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.05, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.82}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "20.000000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=20.000000000000004, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.0", "2147483645"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483645, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "-0.9999999999999999", "-13.46"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.5", "Infinity", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-7.6945778167725332E18", "-1.0E-323"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0000000000000004", "-0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.6945778167725332E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483640"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483640, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"4.9E-324", "1.8200000000000003"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.39999950000000006", "4.9E-324", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.7976931348623157E308", "7.82", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.82, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.797693134862...#209#1242416275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.7419999999999999", "-1.9530000000000003", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9530000000000003, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#220#-811183075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "0.0", "7694577816772532779", "1.0000000000000004"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.19999974999999998", "2147483611"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "0.157", "-2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483611, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.1999997499999...#205#321693987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"NaN", "-6.73", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.19999975", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.19999975}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-10.100000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.100000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-10.100000000000001, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.8200000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.8200000000000003, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "57"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=57, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "4.000000000000001", "1.8010000000000004", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.8010000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4...#217#-1263959075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-1.2000000000000002", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.03999995"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.03999995, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.799999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.799999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "5.0E-8"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "1.7976931348623158E307", "4.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=5.0E-8, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.673"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.673, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-19.53"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-19.53, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.57"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.57, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "3.968", "-0.982", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-2.0000000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.7976931348623157E308", "-6.73", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.68", "0.0", "-65"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.68}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.9999999999999998", "0.33999999999999997", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.33999999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.33999999999999997, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#219#104493113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.3999995", "7.040000000000001", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "20.0", "1.8200000000000003", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.040000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0...#209#246578190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.021001000000000002", "-0.2", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.2, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.021001000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.5389155633545066E19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5389155633545066E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.5389155633545066E19, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "61.367", "-0.44", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.44, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=61.367}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.34000000000000014", "10.000000000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.3400000000000001", "-39.06"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34000000000000014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "112"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=112, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-9.999999999999997E-6", "1.0000000000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.999999999999997E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-Infinity", "6.053000000000001", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=6.053000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-I...#208#-2003208974", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "2.2200000000000006"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.2200000000000006, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "7.812000000000001"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7.694577816772533E19", "-1.57", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.812000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.57, getFunctionValueAccuracy=7.812000000000001, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.69...#217#1510867032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-56.43", "-0.19999975"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-56.43", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.7976931348623157E308", "-3.14", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.57"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-5, getRelativeAccuracy=-1.57, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-78.12", "-1.5699999999999998", "3.14"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "2.0", "Infinity", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.9999999999999996"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.9999999999999996, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.5389155633545064E19", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.53891556335450...#206#810823448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.75", "-2.0000000000000004", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0000000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-200.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "10.000000000000004", "2.0000000000000004", "-23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.0000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=-23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=10.00000...#211#1171359363", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "6.73", "NaN", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.73}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"39.06", "NaN", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "9.999999999999999E-6", "-1.9400000000000002", "130"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9400000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=130, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.99999...#214#1583590825", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.5100000000000002", "6.700000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.9999999999999995E-6", "3.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5100000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-2.0000000000000004", "1.0E-6", "-3.14"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "0.19624999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.19624999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.8200000000000003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.8200000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.8200000000000003, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.8200000000000003"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.25", "-2013265949"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.8200000000000003, getIterationCount=-2013265949, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.25...#201#-629138032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7694577816772532779", "-4.0", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-4.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725...#207#1643408836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.82"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.82, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.25", "1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "-0.3906", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.050000000000000024"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.5100000000000005", "0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.050000000000000024, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "1.41", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.41, getFunctionValueAccuracy=1.0E-15, getIterationCount=6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623155E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.080001", "Infinity", "-1073676288"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073676288, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.080001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-0.03999994999999999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.03999994999999999, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-39.06000000000001", "-7.6945778167725332E18", "8192"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=8192, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-39...#216#1162860420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "0.0", "3.0", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0000000000000004, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "0.46", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.46, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-38.970000000000006"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-38.970000000000006, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.7976931348623157E308", "NaN", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-9.82", "-4097"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-4097, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-9.82}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:2>", "-0.39999950000000006", "3.8472889083862666E18", "0.17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.7849999999999999", "0.7849999999999999", "-1073741769"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "15.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7849999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=15.0, getFunctionValue=0.7849999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741769, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0...#218#-124587622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "21.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=21.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "2.0", "-9.999999999999997E-8", "0.34"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-9.82"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-9.82, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-4.91"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.91", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-4.91, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "4.9E-324", "9.999999999999997E-8", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999999999997E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=9.999999999999997E-8, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#210#319763630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-3.4999995000000004", "1.953"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.3999995", "1.4999999999999998", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.4999995000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
}
