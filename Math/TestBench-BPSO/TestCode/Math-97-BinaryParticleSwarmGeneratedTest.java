package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-1.7976931348623155E308", "1.5", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.5000000000000001", "NaN", "NaN"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.1295", "2.13667230773906688E18", "20.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.7976931348623157E308", "Infinity", "<sample:10>"}, {"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.0", "65.0", "20.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("50.00000005296516", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=50.00000005296516}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.625", "1.625"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"2.13667230773906688E18", "0.259", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-Infinity", "10.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5059999711151123", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5059999711151123}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"NaN", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.9999999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-4.9E-324", "0.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.3000000000000003", "0.5000000000000001", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "0.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.27999999999999997", "1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0120005", "NaN"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-0.1", "-32.5", "<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"2.8", "1.5000000000000002", "-1.7976931348623158E307"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-2.13667230773906714E18", "3"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.13667230773906714E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-Infinity", "0.25899999999999995", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.5", "-Infinity", "9.999999999999997E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!IllegalSta...#212#424130324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.5", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.2950000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2950000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.2950000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateE...#209#1801718620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=Infinity, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "-16.25", "-0.9999999999999999"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.2", "1.0", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-4.9E-324", "0.12949999999999998"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.12949999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.12949999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-62"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-62, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-8.124999999999998", "-2047"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2047, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-8.124999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "0.1395"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"5.0E-7", "1.0000000000000001E-7", "-2.0E-6"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.9999999999999999", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "20.000000000000004", "Infinity", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.5", "-2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-162.5", "-Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-Infinity", "NaN", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E307", "5.000000000000002"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-0.028"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.028, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.5000000000000001", "0.0", "Infinity"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"32.5", "-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-4.2733446154781338E18", "-Infinity", "1.06833615386953344E18"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "-Infinity", "-1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "0.5", "1.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.666666530883789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.666666530883789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-32.49999999999999", "8388618"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "19.981", "-5.2", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=8388618, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-32.49999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-Infinity", "1.7976931348623157E308", "<sample:5>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-0.5", "10.0", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "30.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=30.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.15", "0.6"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "5.000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "6.499999999999999", "0.4"}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-27.009999999999998", "2.13667230773906688E18", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "65.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-4.9E-324", "1.0", "NaN"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.259", "-0.259", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.17266650799560543", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.17266650799560543}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0E-7"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623155E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623155E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-7, getResult=!IllegalSta...#212#-1682062347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623157E308", "0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.29999999999999993", "0.35000000000000003", "1.0"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-2.13667230773906714E18"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.13667230773906714E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1009846136", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-16.25", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.833333187616349", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=-10.833333187616349}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.797693134862316E307"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.797693134862316E307, getResult=!IllegalSta...#212#-1562969026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#-1091245901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"2.59", "10.0", "20.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.9999999999999998", "1.5", "-1.7976931348623157E308"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "64.99999999999999", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "0.1295", "1.0", "0.023001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623155E308", "2.0", "-4.9E-324"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0E-323", "4.2733446154781343E18", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-325.0", "0.0", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.7976931348623157E308", "-1.5", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.2650000000000001", "2"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "4.2733446154781338E18", "2049"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.2650000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "3.25", "0.1295", "0.1295"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"10.0", "3"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.574", "3.418", "0.2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.4999999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.4999999999999998, getResult=!IllegalStateEx...#208#-1000055773", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.14250000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.14250000000000002, getResult=!IllegalStateE...#209#-1005598074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0E-323", "3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.7976931348623157E308", "0.12949999999999998"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.25", "-1.7976931348623157E308", "-1.7976931348623153E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0E-323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-16.25", "2.37"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-Infinity, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "0.25", "1.7976931348623157E308", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-0.5", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.5", "1.0000000000000002", "1.0000000000000002E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-2.13667230773906688E18", "-2136672307739067002", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.5000000000000001, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateEx...#208#-508654671", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.06833615386953344E18", "1073741823"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.06833615386953344E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.5", "-2136672307739067002"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.3000000000000003", "0.5", "-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-32.5", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-2.3400000000000003", "Infinity", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "5.0E-7"}, {"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "Infinity", "-1.7976931348623157E308", "-1.015"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0E-6", "2147483647"}, {"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "0.028999", "-0.11999900000000001", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"2.0", "1.7976931348623157E308", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.2, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"48.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=48.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!IllegalSta...#212#424130324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0000000000000002E-6", "1.5", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "Infinity", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.5", "-3.2", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalS...#214#107325012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0E-7"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-7, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-31.5"}, {"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-5.0E-7", "1.7976931348623157E308", "-2136672307739067002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-31.5, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!IllegalStat...#211#1155773898", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"131073"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=131073, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-44.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "1.0", "1.5", "-0.030000000000000027"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-44.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-1.7976931348623155E308", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-16.25", "-Infinity", "0.259"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.198462089908212E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.198462089908212E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"4.9", "15"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "-1.7976931348623157E308", "-2.13667230773906662E18"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=15, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"4.9E-324", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.5, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.04"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.04, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "-4.9E-324", "0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "-162.5", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.33333346911621087", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.33333346911621087}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"NaN", "-2136672307739067002"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-1.7976931348623155E308"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"5.0E-7", "0.025900000000000003", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "0.518"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025900000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.518, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.025900000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-32.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-32.5, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "Infinity", "1.997"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2.9999989999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.9999989999999994, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "-8192"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-8192, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2.13667230773906662E18"}, {"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.13667230773906662E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalS...#214#-1974790336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"8.988465674311579E307", "-0.0", "2.13667230773906688E18"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.1222410257969024E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=49, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.1222410257969024E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-16.25", "2.0", "-4.9E-324"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-4.0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-46"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623155E308", "20.000000000000004", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-46, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.625", "1.0", "-0.35000000000000003"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5499999291534424", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5499999291534424}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623155E308", "0.1295", "32.49999999999999"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.919666523522615", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=10.919666523522615}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-52.25", "-2136672307739067002"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-16.250000000000004", "-24.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-32.5", "NaN", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-18.83333321741867", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-18.83333321741867}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.259", "-1.7976931348623157E308", "NaN"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"20.0", "-16.25", "1.6250000000000002"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.291666521811008", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-10.291666521811008}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-1.0E-6"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "Infinity", "6.4", "30.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.0E-6, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=14.433333354509356}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-16.25", "Infinity", "-0.3500000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.3500000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.4860000000000001"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.4860000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalState...#210#269084257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"39.76", "0.25000000000000006", "1.625"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7083333962326049", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.7083333962326049}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"10.0", "1.0", "2.59"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5299999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623155E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=47, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5299999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-8.988465674311579E307", "-49.741", "-0.5"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-1.7976931348623157E308", "276"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=276, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "8.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=8.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "40.00000000000001", "-32.5", "0.243"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.96", "65.056", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-21.585666817211624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "0.06475", "0.74"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.06833615386953344E18", "4.2733446154781338E18", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.5000000000000002", "1.7976931348623157E308", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-2.13667230773906662E18", "2147483647"}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.13667230773906662E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-17"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "3.15", "-2136672307739067002", "4.2733446154781338E18"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-17, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0", "1.7976931348623158E307"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-2.136672307739067E19"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-2.136672307739067E19, getResult=!IllegalStat...#211#554176399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.6249999999999998", "1.6250000000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.295"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.6249999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.295, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.1295"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.1295, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-2.13667230773906662E18", "-0.35000000000000003", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "-Infinity", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483609"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483609, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#77755861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-19.93525", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-19.93525}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-4.9E-324", "-20.0", "0.1295"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#1302037727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.625", "10.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "4.0"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "20.0", "-32.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=4.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-Infinity", "1.0E-7"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "0.8125"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8125", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.8125, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.259"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-Infinity", "0.259"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.259, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.06474999999999999", "68.12950000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.1295", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-2.13667230773906688E17", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=-2.13667230773906688E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.1366723077390668E19", "-2136672307739067002", "20.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-6.5", "-52"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-52, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-6.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=5.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.1625", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-4.9E-324", "1.5000000000000002", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=4.9E-324, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-3.25"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=-3.25, getResult=!IllegalStateExcepti...#203#1994965842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-23, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.02", "1.06833615386953344E18", "20.0"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.1222410257969024E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.1222410257969024E17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"19.999999999999996", "0.49999999999999994", "NaN"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49999999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-16.249999999999996", "1.72", "0.8125"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.0", "3.9999999999999996", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4174999230270386", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.4174999230270386}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906688E18", "1.7976931348623157E308", "-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-2136672307739067002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-2.13667230773906688E18, getResult=!IllegalSt...#213#-425134289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "33.8", "-32.5", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-21.666666812383653}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "Infinity", "0.23400000000000007"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "3.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.23400000000000007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.25, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.23400000000000007}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-1.625"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.625, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0", "1.295"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "Infinity", "-0.45999900000000005", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-14"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-14, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-5.6000000000000005"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.6000000000000005, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalState...#210#183361340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "-0.25900000000000006", "-32.5"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "0.1245", "-0.7000000000000001", "-2.13667230773906662E18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.005999859428881", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-11.005999859428881}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1073741824, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#-1091245901", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-0.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.7000000000000002", "1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.7000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.259", "0.25900000000000006", "-0.057"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "53.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=53.5, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.259", "-61430"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-61430, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.259}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2.13667230773906688E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.13667230773906688E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.13667230773906688E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalS...#214#-152242820", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"28"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=28, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#300000847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-32.5", "9.999999999999997E-7", "-32.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.2, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.4999999999999998", "-1.0", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-2136672307739067002", "1.0E-323", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3333334691162109", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.3333334691162109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.7976931348623155E307", "3"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "16.25", "-1.06833615386953344E17", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623155E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-Infinity", "-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-1.0E-323", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "0.54", "0.1295"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.4999999999999998", "Infinity", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.40316668864440924", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.40316668864440924}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-4.9E-323", "0.1295", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.625", "2.13667230773906688E18", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.42444820515938048E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.42444820515938048E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-16.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-16.25, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "32.5", "-0.451"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("21.516333488010886", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=21.516333488010886}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.1295", "-32.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#300000847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "65.00000000000001", "1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("43.6666665308838", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=43.6666665308838}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"2.0000000000000004", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#300000847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "32.5", "1.5250000000000001"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"23"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.7976931348623157E308", "1.7976931348623157E308", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=23, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"65.00000000000001", "Infinity"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("65.00000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"15.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=15.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!IllegalSta...#212#424130324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "0.5", "-Infinity"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=Infinity, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-32.50000000000001"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-32.50000000000001, getResult=!IllegalStateEx...#208#-444835386", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "Infinity", "65534"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.03500000000000001", "0.25899999999999995", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65534", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=65534, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.0E-6", "10.000000000000002", "0.1295"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=6.709833441114903}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"0.16", "65.0", "16.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("48.75000001571226", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=48.75000001571226}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.16250000000000003"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.16250000000000003, getResult=!IllegalStateE...#209#-1083883929", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"4.9E-324", "65.43"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "NaN", "-1.0", "1.9999999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.3162841796874977E-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.0000000000000003E-5", "-32.5", "-0.35000000000000003"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-21.783333472096444", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-21.783333472096444}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-14.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-14.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.9999999999999996", "NaN", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.5000000000000001", "-0.21900000000000003", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.1459999430541992}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.8125", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.8125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.7976931348623155E308, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-567199054", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2047"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2047, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-0.1295", "-2147483645"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483645, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.1295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.0", "20.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2.13667230773906714E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.13667230773906714E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1009846136", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "0.1295", "3.25"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "2.13667230773906688E18", "-22.0"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.42444820515938048E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.42444820515938048E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#1302037727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-2.13667230773906688E18", "Infinity", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=NaN, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!IllegalSt...#213#-820934313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-1.625"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.625, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-16.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-16.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-16.25, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-Infinity, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.625", "1.7976931348623155E308", "1.625"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.198462089908212E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "2.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"2.1366723077390668E19", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1366723077390668E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.13667230773906662E18"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=2.13667230773906662E18, getResult=!IllegalSta...#212#-862095448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-1.7976931348623157E308", "-1"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "-0.1295", "1.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.1295", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.0E-323"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-323, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0E-323", "0.45"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"64.99999999999999", "-Infinity", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "0.25899999999999995"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.25899999999999995, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalState...#210#495818794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "0.5000000000000001", "-0.5370000000000001", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0000000000000002E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-2.5705", "-64.99999999999999", "65.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStat...#211#-1198307578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"64.99999999999999"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=64.99999999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateEx...#208#-152576697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0E-323", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "5.000000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.2500000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=5.000000000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.2500000000000001, getResult=1.0E-323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.0", "-2147483646"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483646, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.259", "2.0", "1.0000000000000002"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6666665308837891", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.6666665308837891}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-20.0", "20.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-536870909"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-20.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-536870909, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#-414106305", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"268"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-2.13667230773906688E18"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=268, getRelativeAccuracy=-2.13667230773906688E18, getResult=!IllegalSt...#213#-1441268302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-32.49999999999999", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-32.49999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=2.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-32.49999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.15", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=NaN, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-1.625"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.625, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-3.247"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=4.9E-324, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-3.247, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.46", "-2147483595"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483595, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.20000000000000018", "Infinity", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-15.88", "1.4999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "0.259"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-32.5", "-4.9E-324", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.259, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483588"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483588", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483588, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#748536587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-32.5", "20.0", "0.5"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("13.49999988743019", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=13.49999988743019}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-8.124999999999998", "1.7976931348623155E308", "1.7976931348623158E307"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.258385194403622E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=47, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.258385194403622E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#300000847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.0", "-1.7976931348623157E308", "0.01295"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "Infinity", "20.0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.13667230773906688E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=2.13667230773906688E18, getResult=!IllegalSta...#212#819930348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "-17.375", "0.9999999999999999"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.249999865078449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-11.249999865078449}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"2.1150000000000007", "0.1625", "8.5"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.1295", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1295}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-1.06833615386953344E18", "-1.0E-323"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.12950000000000006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.12950000000000006, getResult=!IllegalStateE...#209#-1449526439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-0.5", "13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=13, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.5000000000000002"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5000000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateE...#209#-1306528266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1027"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1027, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "2.0000000000000004", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-16.25", "0.259"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4999999768371586", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.4999999768371586}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-65.0", "0.259", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-0.9999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-0.9999999999999999, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateE...#209#-180483902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.5", "-8.125", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-0.35"}, {"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.35, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0000000000000002E-6", "-70"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-70, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000000000000002E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.1366723077390668E19"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1366723077390668E19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.1366723077390668E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-4.9E-324, getResult=!IllegalS...#214#-1514699645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.259", "5.0E-7", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0E-7}", SearchInputFactory_scaffolding.receiverState());
 }
}
