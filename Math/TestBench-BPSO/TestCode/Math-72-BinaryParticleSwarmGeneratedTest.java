package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623158E307", "0.0", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-7.6945778167725343E18", "NaN", "0.49999999999999994"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "NaN", "7694577816772532779"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "-1.7976931348623158E307", "31.720500000000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-20"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-1.7976931348623158E307", "2.0", "1.0000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-1.7976931348623157E308", "1.5389155633545066E19", "1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-20, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.6800000000000002", "7.6945778167725338E17"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "7.6945778167725322E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6800000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=7.6945778167725322E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.68000000...#209#-643165952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "1.5389155633545066E19", "7.6945778167725322E18"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2824296361287543E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-0.9999999999999999, getIterationCount=46, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.2824296361...#210#-2004352412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.6500000000000004", "7.2301", "0.025001000000000002"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.828400405943156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-Infinity, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.828400405943156}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "7694577816772532779", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-56.025999", "-1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"7694577816772532779"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.74", "0.9999999999999999", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.9999999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725332E1...#219#621711880", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "1.4409999999999998", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:4>", "1.7976931348623157E308", "NaN", "0.49999999999999994"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.1", "-1.0", "1.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.9299999999999999", "6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0000000000000002E-6", "-2.4000000000000004", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9299999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.1909999999999998", "-1.7976931348623157E308", "65546"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623157E308, getFunctionValueAccuracy=NaN, getIterationCount=65546, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.190...#214#766539678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "4"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.5", "-6"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "3.92"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-7.0"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-7.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "-1.7976931348623155E307", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623155E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623158E307", "1"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.05"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7.6945778167725332E18", "7694577816772532779", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.05, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623158E307, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "0.4999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"63.441", "-1.7976931348623157E308", "<sample:7>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "2.0000000000000004", "Infinity", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623155E308", "268435466"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-0.9999999999999999", "-0.25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=268435466, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.797693134862315...#206#-355181794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"7694577816772532779"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725332E18, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623158E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623158E307, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.9999999999999998E-5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "41.0", "14.409999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.9999999999999998E-5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.441", "-4"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "7.6945778167725332E18", "-1.0000000000000002", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.441}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "20.500000000000004"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=20.500000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"63.441"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "20.500000000000004", "35.0", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "19.1", "0.5", "-7.6945778167725343E18"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=63.441, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.0E-6", "7.6945778167725343E18"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-1.7976931348623158E307", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=5, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"20.500000000000004", "31.720500000000005"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.5", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-3.4000000000000004", "3.8472889083862666E18", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "0.5", "31.714500000000005"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623155E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"7.694577816772533E19"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=7.694577816772533E19, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0000000000000004", "37.0", "-16777198"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "-1.7976931348623158E307", "1.7976931348623157E308", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=37.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-16777198, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.00000000000000...#203#361107359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "7.6945778167725332E18", "31.720500000000005"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623158E307", "8388609"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=8388609, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623158E...#204#-2099443730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-7.6945778167725332E18", "Infinity", "1"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "3.27205"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=3.27205, getResult=-7.6945778167725332E...#203#1476219128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"7.6945778167725322E18", "2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725322E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7.6945778167725332E18", "-0.020000000000000073", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.020000000000000073, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.69457...#215#1970137830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.5389155633545066E19", "2.0", "536870915"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=536870915, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.538915563354506...#205#1998732524", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"7.6945778167725332E18"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.6945778167725332E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "1.7976931348623157E308", "0.14409999999999998", "1.4409999999999998"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"3.172050000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7.6945778167725322E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725322E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=3.172050000000001, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-10.0", "20.558", "2147483614"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=20.558, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483614, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "1.0", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"31.720500000000005"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=31.720500000000005, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-20.499999999999996", "3.8472889083862666E18", "-0.49999999999999994"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623158E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "2.0", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.8000000000000003", "NaN", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.8000000000000005"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.8000000000000005, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-10.9", "-1.0000000000000002"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.49999999999999994"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.49999999999999994, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "0.075"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.1", "0.9999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.0", "-1.7976931348623155E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.5", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "4.9E-324", "0.0", "-1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.055", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-1.0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.25, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.4409999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.49999999999999994", "-8.988465674311579E307", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.4409999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-7.6945778167725332E18", "Infinity", "2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.69457781...#212#-1029309948", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.04"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.04, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.49999999999999994", "-0.5", "0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-7.6945778167725343E18", "0.9999999999999999", "-1.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"16383"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=16383, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"3.0", "-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-7.694577816772534E19", "0.380002", "0.4999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-Infinity", "-0.5", "1"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.7976931348623157E308", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.1", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-10.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-10.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-7.6945778167725332E18", "-3.8472889083862676E18", "-59"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.8472889083862676E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.8472889083862676E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-59, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.6...#219#-1792388001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.49999999999999994, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.5", "1.7976931348623158E307", "0.05"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-7.6945778167725343E18", "-1.5389155633545069E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "Infinity", "15.000000000000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623155E308", "-7.6945778167725353E18", "0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.6945778167725353E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.797...#218#-1006635992", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.9999999999999999, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "51.0", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=51.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623155E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "63.441", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "20.5", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("63.441", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.0", "0.16999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "205.0", "1.0659999999999998", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.4409999999999998", "1.0", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.4409999999999...#204#850812249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-3.5953862697246315E307", "12.44100000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.4999999999999998", "505.0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.5953862697246315E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2146959360"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2146959360, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623158E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-1.7976931348623155E307", "0.36000099999999996"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-8.988465674311579E307", "-Infinity", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.5", "-7"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-7, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-8.988465674311578E307", "-3.8472889083862671E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.30000000000000004", "NaN", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "-3.8472889083862671E18", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.992", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.5953862697246315E307, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"6.3441", "20.500000000000004", "63.441"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.9999999999999999", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0", "-2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "7.6945778167725343E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725343E18, getResult=-...#204#1609489932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7694577816772532779", "NaN", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725...#207#1161086544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-0.0", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623158E307", "126.88200000000002", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=126.88200000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-...#223#-9631882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "NaN", "-1025"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1025, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "NaN", "23"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-7.6945778167725343E18", "NaN"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.6945778167725343E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"134217727"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=134217727, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-Infinity", "0.75", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.991"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.2999999999999998", "-1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.6945778167725343E18", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.2999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-24.000000000000004", "1.4409999999999998", "2147467263"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.4409999999999998, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147467263, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-...#219#-291597854", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.5", "7694577816772532779"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "7694577816772532779", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725332E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "0.49999999999999994", "-8.988465674311579E306", "126.882"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "20.5", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=20.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "7.6945778167725332E18"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-1.01", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:4>", "-0.54", "7.6945778167725322E18"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.54", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"4.9E-324", "0.5"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.6945778167725343E18"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725343E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"8.988465674311579E306", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=8.98846567431157...#206#399537265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.49999999999999994", "-20.499999999999996", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-20.499999999999996, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#220#1747815327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.5953862697246315E307, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-20.499999999999996"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-20.499999999999996, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"31.720500000000005", "10"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=31.720500000000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "2.05"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.05, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "NaN", "2"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "NaN"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "3.1720500000000005", "5.0E-7", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.17205000000...#206#-1073103993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623156E306", "-0.27"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "4.4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623156E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=4.4, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.054000000000000006"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.054000000000000006, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "2.6500000000000004", "7.6945778167725322E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "3.8472889083862671E18", "-7.6945778167725322E18", "3.8472889083862666E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725338E17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725338E17, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.5", "1.7009999999999996"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.797693134862316E307", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "2.2"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "20.499999999999993"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "-Infinity", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=20.499999999999993, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-7.694577816772534E19", "0.14100000000000001", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-8.988465674311579E306"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.49999999999999994"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-0.9999999999999999", "7.6945778167725332E18", "-7.6945778167725322E18"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-8.988465674311579E306, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.49999999999999994, getResult...#203#-2121202561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"33554432"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=33554432, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.5389155633545066E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-20.499999999999993", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5389155633545066E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.5389155633545066E19, getResult=-20.4999999...#209#2134308728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"3.1720500000000005", "Infinity", "7.6945778167725322E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-10.0", "1.4409999999999998", "-4.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "4.9E-324", "36"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=36, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "7.6945778167725312E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725312E18, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-20.499999999999996", "0.4900009999999999", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.4900009999999999, getFunctionValueAccuracy=NaN, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-20.4...#215#-2041676385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "3.8472889083862666E18", "0.7204999999999999", "1.5389155633545069E19"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-7.6945778167725343E18", "2.05", "3.8472889083862666E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.65, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623...#208#-1021771932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-4.9, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.4649999999999996", "-2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.4649999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<null>", "-Infinity", "7.6945778167725332E18", "63.441"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "7.6945778167725332E18", "0.49999999999999994"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0", "-1.7976931348623156E306", "10"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623156E306, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-2.7", "2.0500000000000003", "0.24999999999999994"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "7.6945778167725322E18", "-1.7976931348623158E307", "-0.49999999999999994"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.24999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.24999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7.6945778167725322E18", "2.0", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.69457781677253...#206#1240429196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "1.0", "-62.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "20.499999999999996", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "9.999999999999997E-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=9.999999999999997E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-2.65", "3.8472889083862671E18"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.5389155633545064E19", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "20.499999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.65", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=20.499999999999996, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.6945778167725353E18", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.6945778167725353E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.6945778167725353E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "10.249999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=10.249999999999998, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.49999999999999994", "11.46", "7.6945778167725343E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-1.7976931348623157E308", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623...#208#-424340081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.08"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.08, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "1.3250000000000002", "-42"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.3250000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=-42, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-14.399999999999995", "1.92364445419313306E18", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.92364445419313306E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.92364445419313306E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-14.3...#215#-1861660547", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483620"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483620, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.4"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.4, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623158E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-23.0", "0.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "7.694577816772533E19", "15.86025"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.0E-323", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.49999999999999994", "31.720500000000005", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "131072"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=131072, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "36"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=36, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-3.5953862697246315E307"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "7694577816772532779", "63.440999999999995"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.5953862697246315E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0E-6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=2.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-3.5953862697246315E307", "-7.6945778167725332E18"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.5953862697246315E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "536870915"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=536870915, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"4194324"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=4194324, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.9999999999999999, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"5.000000000000001", "7694577816772532779", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#221#-514894073", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "2.013", "536870922"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.013, getFunctionValueAccuracy=1.0E-15, getIterationCount=536870922, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.48", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "0.0", "11.5", "-0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.04999999999999999", "-1.4409999999999998", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.4409999999999998, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#221#-1528677276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-10.249999999999998", "31.72050000000001", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-0.24999999999999997", "134217727"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=134217727, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.24999999999999...#204#-1367240666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "41.00000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=41.00000000000001, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"31.720500000000005", "-3.8472889083862671E18", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"4.136", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-1.0", "126.96600000000001", "2.6500000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.797693134862316E307", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.797693134862316...#205#-693928360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-73.999998", "0.49999999999999994", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "14.409999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.49999999999999994, getFunctionValueAccuracy=14.409999999999998, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14,...#222#657098821", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "15.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "40.99999999999999", "-0.54"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=15.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "3.8472889083862666E18", "0.0", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.8472889083862666E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.5389155633545066E19", "NaN"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "-0.5400000000000001", "7.6945778167725332E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5389155633545066E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.49999999999999994", "63.44100000000001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.14409999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-0.5399999999999999", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=-0.14409999999999998, getResult=-0....#217#-479088883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.7204999999999999", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.7204999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.075", "7.6945778167725343E18"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "9.999999999999999E-6", "3.8472889083862661E18", "7.6945778167725322E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.075", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.6500000000000004", "-1.0", "1"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.6500000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "5.600000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.49999999999999994", "41.16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0000000000000002E-6", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000000000000002E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-11.54", "7.6945778167725338E17", "2147483647"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725338E17, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResul...#209#-992480716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-32"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.5000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.5000000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-32, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:3>", "-4.9E-324", "2.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.6500000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.6500000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623157E308", "NaN", "-57"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-57, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308...#201#-21824867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0E-6", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"62.5"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=62.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-7.6945778167725322E18", "-7.6945778167725332E18", "-268435455"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-268435455, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#226#802944328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "9.1441", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.1441}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "7694577816772532779", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "NaN", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "3.8472889083862666E18", "0.9519999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7.6945778167725322E18", "-1.0", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9519999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9519999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.650000000000001", "1.7976931348623157E308", "0"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.6500...#212#-544119830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-2.650000000000001", "-1.0", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623155E308", "30.0", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=30.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.79769313486...#210#969606443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "15.86025"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.0000000000000002E-6"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"7694577816772532779", "-2.6500000000000004", "-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-4.7", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "7.6945778167725338E17", "-43"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-43, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725338E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.06"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.06, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-1.7976931348623157E308", "7.6945778167725343E18", "-7.6945778167725343E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.0", "20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"2.0000000000000004", "1.7976931348623157E308", "317.20500000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"2.6500000000000004", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6500000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"2.0E-6", "Infinity", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.97", "Infinity", "-1073741761"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741761, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.97}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623157E308", "7.6945778167725332E18", "0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "0.265", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976...#217#1626311296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-7.6945778167725353E18", "7.6945778167725332E18"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.6945778167725353E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.8472889083862661E18", "8.988465674311578E307"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.8472889083862661E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623158E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-3.847288908386267E19", "7.6945778167725332E18"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.9999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.9999999999999999, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.49999999999999994", "7.6945778167725332E18", "-3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999...#214#1251428692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "Infinity", "31.720500000000005"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "3.0778311267090133E19", "-4"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.0778311267090133E19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-20.699999999999992", "1.1099999999999999", "7.6945778167725332E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "27.650000000000002", "-94"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-94, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=27.650000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "21.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=21.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.0", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.7976931348623158E307", "NaN", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.8472889083862669E17", "7.6945778167725343E18"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.4409999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.8472889083862669E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.4409999999999998, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-0.54", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.54}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "45.441", "7.6945778167725332E18", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=45.441}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.54", "0.5400000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7.6945778167725322E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.54", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725322E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0000000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "22.0", "-3.5953862697246315E307", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.5953862697246315E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.5953862697246315E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRe...#210#562716898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.5", "1.7976931348623155E308"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-6.04"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-6.04, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "20.460000000000004"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "2.0000000000000004", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.460000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=20.460000000000004, getFunctionValue=2.0000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=15, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#227#-633707234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.9999999999999999", "31.720500000000005"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
}
