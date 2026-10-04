package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"NaN", "0.16779999999999984"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "-0.18999999999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.0", "Infinity", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.16779999999999984", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-225.66950000000006", "0.3355999999999997"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-1.0000000000000004", "0.555", "-0.18999999999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-225.66950000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:14>", "-6.461", "-0.3799999999999998"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.6779999999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-7.6945778167725332E18", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3799999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.6779999999999995, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.37999999999...#206#928875558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-317.7200000000001", "0.07000005000000001", "0.04300000000000002"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:2>", "-1.0", "2.6779999999999995", "0.3355999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-317.7200000000001", "-26.79200000000001"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-1.0", "1.0E-6", "-0.3799999999999998"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:14>", "-1.100000000000008", "2.2471164185778944E306"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-370.2750000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-370.2750000000001, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:14>", "-0.0022780000000000005", "0.26779999999999987"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725312E17"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:14>", "0.0", "Infinity", "4.9000005"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.3799999999999998", "1.0E-6", "2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:14>", "-6674.550000000001", "0.0", "-0.71278"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-7.6945778167725322E18", "-4.9E-324", "-180.13750000000005"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-6.461"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-60.04583328070967", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-6.461, getIterationCount=28, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-60.04583328070967}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7.6945778167725322E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725322E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.07"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.07, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.0E-6"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.0E-6"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResu...#205#55562212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725332E18, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.0", "1.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-4.9E-324", "-65"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "54.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=54.0, getIterationCount=-65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-4.9E-324", "65"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "54.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=54.0, getIterationCount=65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0E-323", "-65"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "54.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=54.0, getIterationCount=-65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0E-323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.045", "-65"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "54.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=54.0, getIterationCount=-65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.045}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.045", "-32"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "54.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=54.0, getIterationCount=-32, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.045}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "1.0E-6", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "1.0E-6", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "2.7000010000000003", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.7000010000000003, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.0", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "Infinity", "1.0E-6", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "Infinity", "1.0E-6", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.0", "0.5", "1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "0.5", "1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"50"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=50, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"39"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=39, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-22"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-22, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-22"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-1.7976931348623157E308", "2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-22, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-26"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-1.7976931348623157E308", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-26, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-73"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-1.7976931348623157E308", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-73, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-7.6945778167725343E18", "-1.0", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "-1.7976931348623157E308", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRe...#229#40768564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.7976931348623157E308", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.5", "-1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "-1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:7>", "Infinity", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0E-6", "-3.9999999999999996", "-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.9999999999999996, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#208#1216796071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0E-6", "1.7976931348623157E308", "-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#211#1485804938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"2.0E-6", "Infinity", "-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-4.0", "NaN", "10"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-1.5389155633545066E19", "0.5", "1.0499999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "-1.5389155633545066E19", "0.25000000000000006", "1.0499999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=2.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.9999999999999998", "NaN"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.5", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "NaN", "Infinity", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "2.0", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.797693134862...#209#-165846965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0", "-18.800000000000004", "3"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "7694577816772532779", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-18.800000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0000000000000002", "-18.800000000000004", "3"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "7694577816772532779", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-18.800000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000000...#210#-1077730946", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-14.565"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-14.565, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"14.565"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=14.565, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"7.282500000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=7.282500000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.282500000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.282500000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.323500000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.323500000000001"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-4.000000000000002"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "2147483588"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-4.000000000000002, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.800000000000001"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "2147483588"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.800000000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-3.9800000000000018"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.9800000000000018, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.9600000000000035"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.9600000000000035, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-79.60000000000004"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-7.6945778167725332E18", "1.7976931348623157E308", "4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-79.60000000000004, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"2.0", "NaN", "1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "7694577816772532779"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=7.6945778167725332E18, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.5", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "Infinity", "NaN"}});
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.5", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"NaN", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"7694577816772532779"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResu...#205#55562212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getRes...#206#1816394717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:4>", "0.0", "1.0E-6", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResu...#205#55562212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"9.999999999999999E-6", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"9.999999999999999E-6", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"9.999999999999999E-6", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0E-6"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"9.999999999999999E-6", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-2.0E-6"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-2.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "1.4999999999999998"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.4999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "5.1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.5", "1.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "7694577816772532779", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-8.988465674311579E307", "Infinity", "5.1"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=5.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-8.988465674311579E307", "Infinity", "-0.10000000000000053"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10000000000000053", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=-0.10000000000000053}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "-8.988465674311579E307", "Infinity", "0.10000000000000053"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.7976931348623157E308", "NaN", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10000000000000053", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=0.10000000000000053}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0", "NaN", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "7694577816772532779", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0E-6", "7694577816772532779", "1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:6>", "NaN", "Infinity", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"3.8472889083862666E18", "NaN", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"3.8472889083862666E18", "NaN", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.43"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.43, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.0", "3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "Infinity", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.0", "6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "Infinity", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0, getIterationCount=6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-4.9E-324", "6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0, getIterationCount=6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-4.9E-324", "1"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-4.9E-324", "-65"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.0, getIterationCount=-65, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "1.0E-6", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.0", "0.5", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-57.0", "0.5", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=-57.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-57.0", "0.5", "26"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=-57.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-57.0", "0.5", "26"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=0.1, getResult=-57.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.0E-6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"9.999999999999997E-7"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=9.999999999999997E-7, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=6, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"50"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=50, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-22"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-22, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"490"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=490, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7694577816772532779", "-1.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=-2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=-1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:7>", "Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "7694577816772532779", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "1.5389155633545066E19", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.5", "Infinity", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-7.6945778167725332E18", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.5", "Infinity", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-7.6945778167725332E18", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.5", "Infinity", "74"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=74, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-7.6945778167725332E18", "-4.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "-1.5389155633545066E19", "0.5000000000000001", "1.0499999999999998"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=2.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "1.5", "Infinity", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-4.0", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "NaN", "-4.0", "10"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-4.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "NaN", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.323500000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7694577816772532779", "-7.323500000000001", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.323500000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#222#-936421549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7694577816772532779", "-7.323500000000001", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "Infinity", "7694577816772532779", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.323500000000001, getFunctionValueAccuracy=1.0, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.69...#218#1667211815", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7694577816772532779", "-7.323500000000001", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "Infinity", "7694577816772532779", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.323500000000001, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0...#238#-197427119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-8.596000000000002", "-123"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-123, getMaximalIterationCount=0, getRelativeAccuracy=2.0, getResult=-8.596000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-8.596000000000002", "-123"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-123, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=-8.596000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-9.046000000000001", "-123"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-123, getMaximalIterationCount=0, getRelativeAccuracy=2.0, getResult=-9.046000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-9.046000000000001", "-246"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-246, getMaximalIterationCount=0, getRelativeAccuracy=2.0, getResult=-9.046000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-9.046000000000001", "-246"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "Infinity", "-1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-246, getMaximalIterationCount=100, getRelativeAccuracy=2.0, getResult=-9.046000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0E-6", "0.0", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-2.0E-6", "-51.998", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.399998", "-51.998000000000005", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-7.323500000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-7.323500000000001, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.56", "Infinity", "-1080.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.0", "7694577816772532779", "1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.0", "Infinity", "2.11"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.0", "Infinity", "2.11"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-20.0", "1.7976931348623157E308", "2.31"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.31}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.323500000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.323500000000001, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0E-6", "-7.6945778167725343E18", "-2130706432"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7694577816772532779", "-4.0", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.6945778167725343E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2130706432, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#211#-1856695156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0E-6", "-7.6945778167725343E18", "2147483647"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-7.6945778167725343E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#210#-1737469627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "2.0", "1.0E-6", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "2.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "2.11", "1.5", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.1", "22.9"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.9100000000000001", "2.351"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9100000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.191", "2.351"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.191", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.18999999999999995", "2.731"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.0", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.18999999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.3799999999999999", "2.7309999999999994"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.0", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3799999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.18999999999999995", "2.6779999999999995"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.18999999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.18999999999999995", "2.6779999999999995"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.09499999999999996", "2.6779999999999995"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.3877787807814457E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.18999999999999995", "1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.18999999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.18999999999999992", "0.0779999999999994"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.3877787807814457E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999992", "2.6779999999999995"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.440892098500626E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.440892098500626E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999992", "2.6779999999999995"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:3>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.440892098500626E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.440892098500626E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999992", "2.7389999999999994"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.220446049250313E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.220446049250313E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999992", "2.7389999999999994"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.220446049250313E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.220446049250313E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999995", "1.9389999999999994"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.8999999999999995", "3.877999999999999"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.220446049250313E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.220446049250313E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.9499999999999997", "0.19389999999999993"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.7999999999999997", "0.19389999999999993"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "20.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.7755575615628914E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.7755575615628914E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.7999999999999998", "1.9389999999999994"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:4>", "-1.7976931348623157E308", "-1.0", "0.0779999999999994"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1102230246251565E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.1102230246251565E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.8499999999999999", "0.08389999999999992"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.3877787807814457E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.6999999999999997", "0.16779999999999984"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7755575615628914E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.7755575615628914E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.3355999999999997"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7755575615628914E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.7755575615628914E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.6999999999999997", "0.3355999999999997"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.551115123125783E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-5.551115123125783E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.04029999999999999", "1.3003999999999987"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:1>", "-0.09499999999999996", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.938893903907228E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-6.938893903907228E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.008059999999999998", "1.3003999999999987"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.734723475976807E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.734723475976807E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.008059999999999998", "1.3003999999999987"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.008059999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.008059999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.01612", "0.6501999999999993"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.469446951953614E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.469446951953614E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.08059999999999999", "0.6501999999999993"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.040299999999999996", "0.6501999999999993"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.938893903907228E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.938893903907228E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0806", "0.16779999999999984"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.3877787807814457E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0806", "0.16779999999999984"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.0", "Infinity", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.3877787807814457E-...#203#705489807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0806", "1.7976931348623157E308"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.0", "Infinity", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.3021142204224816E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.3021142204224816E-...#203#-551250800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0403", "2.6779999999999995"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "-0.18999999999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.0", "Infinity", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.938893903907228E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-6.938893903907228E-...#203#-359701415", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0403", "9.354"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.938893903907228E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.938893903907228E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.0403", "96.14"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.014299999999999993", "96.14"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.734723475976807E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.734723475976807E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.014299999999999993", "96.14"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.734723475976807E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.0, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.734723475976807E-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-8.0", "96.14"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-4.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.0, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "2.11", "96.14"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.9999999999999999", "-0.18999999999999992"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "2.11"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.11, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-6, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-7.6945778167725332E18", "0.0779999999999994", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725332E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-7.6945778167725332E18", "0.0779999999999994", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725332E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.16779999999999984", "1.0", "3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.0", "2.0", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.16779999999999984}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.16779999999999984", "2.6779999999999995", "3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.0", "2.0", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.6779999999999995, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.16779999...#210#-1199452522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.3355999999999997", "2.6779999999999995", "2147483647"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.0", "2.0", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.6779999999999995, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0...#218#220024717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-4.0", "0.0779999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "0.3355999999999997", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-7.6945778167725332E18", "1.7976931348623157E308", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.4", "0.1559999999999988"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "0.3355999999999997", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7.6945778167725332E18", "8.988465674311579E307", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-0.4", "-0.15599999999999878"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "NaN", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "0.3355999999999997", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "7.6945778167725332E18", "8.988465674311579E307", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "-0.09499999999999996", "0.0779999999999994"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-7.694577816772533E19", "-2147483647"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.694577816772...#207#827384402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-7.694577816772531E19", "-2147483647"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.694577816772...#207#825537360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-7.694577816772531E19", "-2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.323500000000001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.6...#218#34463525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.8472889083862655E19", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.323500000000001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.84...#218#-1597504919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.8472889083862655E19", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.323500000000001"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "96.14"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-7.323500000000001, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=96.14, getResult=-3.8472...#216#1710820723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "7694577816772532779", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-7.323500000000001", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.323500000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-42"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-42, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1073741697"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741697, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0E-6", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.09499999999999996", "1.7976931348623157E308", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "-Infinity", "-0.18999999999999992"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "0.16779999999999984"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.0", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-0.09499999999999996", "-4.0", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "0.16779999999999984", "2.6779999999999995", "-8.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.9999999999999999", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "20.0", "1.0", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.3355999999999997"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.3355999999999997, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "2.11", "20.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.906", "2.0729999999999995", "10.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.16779999999999984"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.16779999999999984, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "-4.0", "-0.18999999999999992"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.18999999999999992"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.18999999999999992, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.3355999999999997"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "96.14", "7694577816772532779"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.3355999999999997, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-0.5", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-0.3355999999999997"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "96.14", "7694577816772532779"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.3355999999999997, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"191.87"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=191.87, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"167.87"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=167.87, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"167.87000000000003"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-7.323500000000001", "0.3355999999999997"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=167.87000000000003, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.09499999999999999"}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.09499999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "20.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "40.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("40.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-20.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-20.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-20.000000000000004", "NaN"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "8.03356", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.03356", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "0.2677999999999999", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2677999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.7976931348623157E308", "1.0E-6", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "20.0", "-1.7976931348623157E308", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-225.66950000000006", "0.3355999999999996"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-1.0000000000000004", "0.555", "-0.18999999999999995"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "2.0", "-7.323500000000001"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-225.66950000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-4.899997999999999", "-0.7169999999999992"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.9999999999999999", "1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-1.0000000000000004", "0.555", "0.18999999999999995"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.899997999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-97.99995999999999", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-7.200000000000001", "0.555", "0.18999999999999995"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-97.99995999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-97.99995999999999", "21.099999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "2.0", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-7.200000000000001", "0.555", "0.18999999999999995"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-97.99995999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-97.99995999999999", "21.099999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "2.0", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-7.200000000000001", "0.555", "0.18999999999999995"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-97.99995999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.5", "1.7759999999999998"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-7.200000000000001", "0.555", "0.05999999999999994"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "1.03", "1.7759999999999998"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-7.323500000000001", "-7.6945778167725332E18", "-8.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-7.200000000000001", "0.2775", "0.05999999999999994"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.03", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.05150000000000001", "22.659999999999997"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.05150000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=20.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-0.10300000000000004", "45.31999999999999"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10300000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-0.10300000000000004", "45.31999999999999"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10300000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-0.10300000000000004", "44.31999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.0", "1.0", "<sample:8>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10300000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-0.10300000000000004", "88.63999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "4.0", "1.0", "<sample:11>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "0.10300000000000004", "44.31999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "4.0", "1.0", "<sample:11>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.10300000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-0.10300000000000004", "32.319999999999986"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "4.0", "1.0", "<sample:11>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=-0.10300000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "-0.10300000000000004", "32.262999999999984"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "4.0", "1.0", "<sample:11>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "21.099999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.10300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=21.099999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10300000000...#207#-2125269100", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "0.15699999999999997", "16.131499999999992"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15699999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=2.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.15699999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
}
