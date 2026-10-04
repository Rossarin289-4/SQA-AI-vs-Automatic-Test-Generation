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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "0.5000000000000001", "1.7976931348623157E308", "-1.0060000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.056"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-10.060000000000002", "-1.006"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0060002698302268", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0060002698302268}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.706", "9.999999999999995E-7", "-4.958"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "4.999999999999999E-7", "1.0E-6", "0.528"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.633524894714351E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.633524894714351E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.0", "NaN", "-80"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-80, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.0", "-10.0", "-2"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-10.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.125", "-35.05", "-134217729"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-35.05, getFunctionValueAccuracy=1.0E-15, getIterationCount=-134217729, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "26.7", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-10.004000000000005", "1.0060000000000004", "3"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0060000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.004000...#210#-558046895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "Infinity", "10.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.49999999999999994, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623158E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "5.523", "-10.060000000000002", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623158E307, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-10.060000000000004"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.9999999999999999", "0.09999999999999999", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "0.1", "-1.9999999999999995E-6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-10.060000000000004, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.49999999999999994", "1.7976931348623157E308", "-0.599999"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.1"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.1, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.006", "1"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "2.4000000000000004", "0.1", "246"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("246", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.1, getFunctionValueAccuracy=1.0E-15, getIterationCount=246, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.4000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"35.05"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=35.05, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.0", "10.23", "-0.1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.0", "0.10000000000000002", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.09999999999999998"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.09999999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.0", "-2147483648"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-3.53", "0.264", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.264", "-1.0060000000000004", "-47"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0060000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=-47, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.264}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1968"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1968, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"9.999999999999999E-6", "0.992", "1"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.992, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999999999999E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.9500000000000028"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-10.06", "-53.006", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-53.006, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=-0.9500000000000028, getResult=-10.06}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-7.06", "1.0000000000000002"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "10.060000000000004", "13.499999999999998", "1.0559999999999998"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=13.49999958992004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-7.06", "-1.0060000000000004", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=-1.00600036084652}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-9.579999999999998", "-20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-9.579999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.5000000000000001", "NaN", "536870911"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=536870911, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.500000000000000...#202#1236909207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.5", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-0.0706"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-10.060000000000004", "-Infinity", "-0.0706"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.0706, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "16.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=16.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"40.0", "1.7976931348623155E308", "0.318"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.47899999999999987", "-1073741823"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-39"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741823, getMaximalIterationCount=-39, getRelativeAccuracy=1.0E-14, getResult=-0.478999999999...#206#1181303392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "0.9999999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.9999999999999999, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0060000000000004", "-63"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-63, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0060000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-36.1006", "-0.9999999999999999"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-492"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-492", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-492, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-17.525"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-17.525, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.0", "540"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=540, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "1.0000000000000002", "35.01999999999999"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000002534687522", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000002534687522}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.5280000000000001", "1.056", "-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "-7.059999999999999", "-7.06", "-18.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.056"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "-6.5", "1.0000000000000004"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.056, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=2.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.0000000000000004, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-0.5030000000000002", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5030000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"9.999999999999999E-6"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "0.2", "0.5000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=9.999999999999999E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.49999971...#209#-2038692351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-10.060000000000004", "6.856000000000001", "43.981"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.855999747931959", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.855999747931959}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"5"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=5, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.20000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0000000000000002", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=0.20000000000000004, getResult=1.00...#215#-217174347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "2147483647"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623...#208#-424340081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "-0.1", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-10.060000000000004", "-1.0230000000000001", "38.944"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0230002693235876", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0230002693235876}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "0.09999999999999999", "0.5279999999999999", "10.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.10000040817260741}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.006", "-20"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.9999999999999999", "492"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=492, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "Infinity", "1.7976931348623155E308", "0.9509999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.1", "4"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=4, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "NaN", "-8173"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-8173, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-7, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "0.1", "-0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.09999999999999999", "1.0000000000000002", "-0.706"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "Infinity", "-1.006"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.1", "0.528"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10000040817260743", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.10000040817260743}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"10.0", "-0.9579999999999997", "-1.0060000000000004"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:6>", "-7.06", "35.05", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=35.049999686256044}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "-1.0", "0.49999999999999994"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-10.060000000000004", "1.0", "9.999999999999997E-7"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "0.1", "1.0230000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999996703863143", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999996703863143}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.19999999999999998", "-0.12000000000000001", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483638"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483638, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.25000000000000006"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.25000000000000006, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.47899999999999987", "44"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=44, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.47899999999999987}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-1.7976931348623155E308", "9.999999999999997E-6", "492"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=9.999999999999997E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=492, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.797...#218#-386767772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-Infinity", "NaN", "0.948"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-9.999999999999997E-7", "1.0230000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.0", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"5.0E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=5.0E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "5.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "35.04999999999999", "2147483647"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=35.04999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=In...#207#338770020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.006"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.006, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.9999999999999995E-6", "0.7059999999999998", "9.53"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7059996633539198", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.7059996633539198}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.1", "-2147418112"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147418112, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0000000000000002", "-0.09999999999999999", "493"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.09999999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=493, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000...#213#-1331505180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.9579999999999996", "0.9999999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9579995331764217", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9579995331764217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:3>", "-1.7976931348623155E308", "1.9999999999999995E-6"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"10.060000000000002"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=10.060000000000002, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"9.999999999999997E-7"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "1.9999999999999995E-6", "-0.47899999999999987", "-0.9579999999999997"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=9.999999999999997E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-706.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-706.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:6>", "-100.60000000000002", "-10.060000000000002"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.060000337287786", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.060000337287786}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.9999999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0E-6", "-0.09999999999999999", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-7.06", "1.0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.09999999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#208#-2080827112", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-20.120000000000005", "56.0"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "8.988465674311578E307"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=8.988465674311578E307, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-20.0", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-0.04699899999999999", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995007519722}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "0.9999999999999999", "9.579999999999998"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.579999744296073", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.579999744296073}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-3.7060000000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-5.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.7060000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-5.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "NaN", "0.09999999999999998", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.09999999999999998, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#210#-454608467", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:3>", "-0.9590000000000004", "0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-12.999999", "1.0230000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995329380034", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995329380034}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-10.060000000000006", "-1.9159999999999995", "2147483647"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.9159999999999995, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#220#-715814034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:1>", "-0.264", "0.9999999999999999", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999996986389159}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.9999999999999999", "-20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"10.0", "-1.5460000000000005", "0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-10.060000000000004", "Infinity", "524289"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=524289, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.06000000000...#205#-1826642072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.9579999999999997", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "0.09999999999999999", "10.56"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-0.06199899999999999", "0.9999999999999999", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.061998746799707405}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "0.0", "9.999999999999997E-7"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0630005", "-10.060000000000004", "-0.9579999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.499999999999998E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.499999999999998E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-2.012000000000001", "20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.012000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "-2.0000000000000004", "-4.9E-324", "-0.06"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.768371582031251E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.768371582031251E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:6>", "-10.06", "-0.9579999999999996"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "0.528", "NaN", "0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9580002712607381", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9580002712607381}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"10.56"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=10.56, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "10.060000000000002", "0.115"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:4>", "-0.4800000000000002", "0.5000000000000001"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999995326995851", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999995326995851}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"30"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-10.06"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=30, getRelativeAccuracy=-10.06, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-10.058000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-10.058000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "10.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "NaN", "-0.9999999999999999", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "-1.0060000000000002", "2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.999999641656876}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-70.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-70.1, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0060000000000002", "-2.012", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.528", "0.9999999999999998", "Infinity"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "55.94", "-1.0060000000000002", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0060000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, g...#215#-1041325880", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-5.2", "10.000000000000002"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.199999547004699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-5.199999547004699}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.806"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.806, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-0.5030000000000002", "1.0E-6", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.203008651733396E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0", "1.0000000000000002"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:0>", "-1.0060000000000007", "-1.0E-6", "-1.7976931348623157E308"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.4796977043151858E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.4796977043151858E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "Infinity", "-9.260000000000002", "485"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-9.260000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=485, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity...#201#-2111416489", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.49999999999999994", "10.0", "0.9999999999999999"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999716877937", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999716877937}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"100.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "9.999999999999997E-7", "-1.0060000000000004"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=100.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:0>", "-1.0180000000000005", "-0.706", "-1.6020000000000008"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "37.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7060002975463867", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.7060002975463867}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-20.12", "-1.0060000000000007", "0.05600000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-0.1", "1.9999999999999995E-6", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.119999715179205", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-20.119999715179205}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-0.499999", "0.4999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "70.1", "-1.0060000000000002", "-0.4560000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.049999999999999996", "0.48650000000000004", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05000041627883911", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.05000041627883911}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-7.06"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-7.06, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:0>", "-10.0", "-0.09999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0230000000000001", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10000029504299163", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10000029504299163}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.1056", "-1.7976931348623157E308", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#211#-756576197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.194", "0.528", "-1.0E-6"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-10.060000000000004", "35.05000000000001", "469"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.193999675512314", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=35.05000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.1939996...#209#264461700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483608"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483608, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:8>", "-35.05", "-10.060000000000004", "4.999999999999999E-7"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.06000037238002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.06000037238002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "0.5280000000000001", "1.0000000000000002"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5280004501342774", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5280004501342774}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "350.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=350.5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:4>", "1.0", "NaN", "-0.10060000000000005"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-1.0060000000000002"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0060000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "1.0000000000000002", "-10.060000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:0>", "-2.3000000000000003", "1.056"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0559995999336242", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0559995999336242}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"0.5000000000000001", "1.0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995231628418", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231628418}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "NaN", "-9.730000000000002", "-2147483605"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-9.730000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483605, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#204#1531072606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-1.0060000000000004", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "10.0", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "0.6000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.6000005, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.056", "2147483598"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483598, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.056}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"9.999999999999997E-7", "1.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "35.05000000000001", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623158E307", "0.5000000000000001", "10.520000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.1", "2.112", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.09999999999999999, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483640"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483640, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.07060000000000001", "1.056"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0559997313976288", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=1.055999731397628...#202#1747579949", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:3>", "-10.06", "-4.177"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-20.12", "9.999999999999995E-7", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.177000350654125", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.177000350654125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:6>", "-9.890000000000002", "-0.1006"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10060029174685478", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10060029174685478}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-0.951", "-0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-9.579999999999998", "-0.706", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.706, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-9.579999999...#207#680506542", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-3.5300000000000002", "1.1179999999999999"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1179997229576109", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.1179997229576109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.9579999999999997", "10.0", "0.28"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0000000000000002", "0.9999999999999999", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999673426151", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999673426151}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.1", "-100.60000000000002", "492"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-100.60000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=492, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"70.1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=70.1, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:5>", "4.9E-324", "79.074", "70.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-0.706", "2147483156"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("79.07399970542639", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=79.07399970542639}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "3.04", "-1.0", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.04}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-20.120000000000005", "-10.060000000000004", "-0.09999999999999999"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.119999700188643", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-20.119999700188643}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-5.030000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-5.030000000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"52.05", "1.0000000000000002", "-24"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0000000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=-24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=52.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0059999999999998", "10.4"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "1.0000000000000004", "-1.8800000000000017", "-9.999999999999995E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.399999720036984", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=10.399999720036984}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-1.0000000000000002", "4.999999999999999E-7"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999995231626035", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9999995231626035}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0000000000000004", "-35.05", "7"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-35.05, getFunctionValueAccuracy=1.0E-15, getIterationCount=7, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-10.420000000000002", "1.0559999999999998"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.19999999999999998", "5.800000000000001", "-3.9060000000000006"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.79999966621399", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.79999966621399}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-47.5", "0.0", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-47.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "0.0", "10.000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999701976778", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999701976778}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.5279999999999999", "40.05", "0.09999999999999999"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("40.04999970553815", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=40.04999970553815}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.9579999999999997", "-14.12", "-56"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-1.0", "-0.0958", "-0.706"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-14.12, getFunctionValueAccuracy=1.0E-15, getIterationCount=-56, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9579999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:1>", "NaN", "9.999999999999995E-7"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-100.60000000000004", "-1.0060000000000004", "-0.528"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0060003710165626}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.056", "-1.0000000000000002", "35.05"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.000000427246094", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=15, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.000000427246094}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.012000000000001", "-0.9579999999999996", "1.0000000000000002"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.958000251293182", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.958000251293182}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-10.0", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-5.28", "0.5000000000000001", "-4194796"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "35.05", "-0.9579999999999997", "262147"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5000000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=-4194796, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-5....#203#-1692795933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-0.9999999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.9999999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.07000100000000001", "0.5000000000000001", "94.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-10.060000000000004", "0.1056", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.059999697041516", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.059999697041516}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:1>", "0.5000000000000001", "1.0000000000000004"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995231628422", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231628422}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:4>", "-0.26599999999999996", "0.5000000000000001"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999996347427369", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999996347427369}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:6>", "Infinity", "0.264", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5000000000000001, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0040000000000004", "1073741804"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741804, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0040000000000...#204#1407019531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-20"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-20, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-1.9159999999999995", "-1.0", "-0.47899999999999987"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.000000436782837}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "4.999999999999999E-7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=4.999999999999999E-7, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "0.356", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999996929168704}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "1.7976931348623157E308", "-0.353", "-40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.353, getFunctionValueAccuracy=1.0E-15, getIterationCount=-40, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E3...#203#734269965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"66028"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "33.94"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=33.94, getIterationCount=0, getMaximalIterationCount=66028, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-10.060000000000004", "-0.5029999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "2.0000000000000004"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.9999999999999999", "-0.706", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.05999971517921", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0000000000000004, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.059999715...#206#-1150020818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-10.060000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-10.060000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-38.0", "-0.353"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "35.05", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"5.000000000000001", "1.0060000000000004", "2147483647"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0060000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5...#217#-1845620167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.6399999999999999"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.6399999999999999, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.056", "-1.0060000000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0559996185302736", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=NaN, getIterationCount=15, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0559996185302736}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0000000000000002", "9.999999999999997E-7"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "0.05", "0.1", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.1, getFunctionValueAccuracy=1.0E-15, getIterationCount=-5, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "-7.06", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.059999638795853}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"2.8420000000000005", "10.000000000000002", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.842000426650048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=2.842000426650048...#201#-790230292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-7.06", "5.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.059999640583992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.059999640583992}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "1.0230000000000001", "40.5"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0230002941265703", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0230002941265703}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "17.525", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=7, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=17.525}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-10.060000000000004", "9.999999999999997E-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.001886069774624E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "0.7060000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.09999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.09999999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "-1.0060000000000004", "3.505", "1.056"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5049997311234473", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.5049997311234473}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "63.0", "-1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=63.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"45"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "9.999999999999997E-6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=45, getRelativeAccuracy=9.999999999999997E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.9999999999999999", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999...#204#-914504682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<null>", "4.9E-324", "0.5000000000000001", "1.056"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "1.394", "0.0", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:4>", "-0.985", "-0.1006", "0.264"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.1006004217147827}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-0.706"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.706", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.706, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-46.472"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-46.472, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.9579999999999997", "-0.5030000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "0.12300000000000003", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5030004339218141", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5030004339218141}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "9.999999999999997E-7", "7.06", "0.09999999999999999"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.059999579191267}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-10.076000000000004", "1.0E-6", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-5.030000000000001", "-1.006", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-5.0299995203018195}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "-7.06", "35.056"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "-3.0060000000000002", "-1.412", "1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=35.055999686211344}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"9.999999999999998"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=9.999999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-9.999999999999997E-7", "0.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.4999999999999994E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.4999999999999994E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "-0.09999999999999999", "0.5000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "1.7976931348623157E308", "-2.112", "-1.0000000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999997138977053", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999997138977053}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.706", "5.280000000000001", "-10.060000000000006"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.279999727368356", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.279999727368356}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.19999999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"10.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=10.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "-1.006", "-0.09579999999999997"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "-1.0", "-1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.09580043401718136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.09580043401718136}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1006.0000000000003", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-7.0600000000000005", "-3.53", "9.999999999999997E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.059999579191208}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-5.0", "9.999999999999997E-7"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.019767165184019E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.019767165184019E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-2.012"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-2.012, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "-1.7579999999999998", "9.999999999999997E-8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.1913988590240475E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.1913988590240475E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-14.12", "1.046", "4.500000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-18.53", "0.0", "-100.60000000000005"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0459995480179787", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0459995480179787}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:1>", "-5.030000000000003", "-2.012000000000001"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "NaN", "984"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.012000359773637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.012000359773637}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-22.92000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-22.92000000000001, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.7976931348623157E308", "2147483595"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483595, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.79769313486231...#207#-1374262090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-40.240000000000016", "0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "-1.9999999999999998", "0.9999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999996423721312}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"1.003", "9.999999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999731868503", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=9.999999731868503}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "10.000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=10.000000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "5.0E-7", "0.20000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.0559999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0559999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.528", "1.0230000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.022999630212784", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.022999630212784}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-10.060000000000002"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-10.060000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.056"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "-7.06", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.056, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "0.706", "1.0230000000000001", "20"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0230000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.706}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "1.0E-6", "-19.63000000000001", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-19.63000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-19.63000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.528", "10.23", "-0.706"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.229999710857868", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=10.229999710857868}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-35.999998999999995", "10.14"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-7.06", "-1.7976931348623155E308", "4.904"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-35.99999865623022", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-35.99999865623022}", SearchInputFactory_scaffolding.receiverState());
 }
}
