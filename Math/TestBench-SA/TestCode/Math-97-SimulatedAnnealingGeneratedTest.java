package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "2.0", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "5.0", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.0", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "5.0", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "5.0", "5.0", "1.5"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0", "1.0", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"NaN", "-2147483584"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "10.0", "0.5"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "NaN", "NaN", "52.58"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483584, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623155E307", "-1.0683361538695332E19", "18.999999999999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "-2136672307739067002", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-7.1222410257968957E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-7.1222410257968957E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"NaN", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.5, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.3416807693476672E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.3416807693476672E16, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1624996362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.3416807693476672E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:5>"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.3416807693476672E16, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.341680769347668E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:5>"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "15.0", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.341680769347668E16, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=15.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"10"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-12"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-12, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"32756"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=32756, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-67076108"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-67076108, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcepti...#203#-505652547", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.5", "Infinity", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "1.0", "-2136672307739067002"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.13667230773906688E17"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.13667230773906688E17, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!I...#221#2050036571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "5.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0E-6", "-5.000000000000003"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "-1.0", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "Infinity", "1.0E-6", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-1.0", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-Infinity", "-1.0", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0E-6", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "2.0", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "5.0", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0", "1.5"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "2.0", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.4"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=2.4, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.9999999999999999, getResult=!IllegalStateEx...#208#-48203834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.52", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "2.0", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "3"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.028"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "-0.120001", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.028, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.028"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "-0.120001", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.028, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-2.514"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "-0.120001", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.514, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.514"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "-0.120001", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.514, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.5, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.452"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.452, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "0.942"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=0.942, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.884"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.884, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.5", "1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "5.0", "1.0", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "1073741823"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "2"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "-55"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "55"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-6"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7000000000000002", "-1.7976931348623157E308"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"4.972", "-2.5899989999999997", "-4.9E-324"}, false, 15, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "-2.5899989999999997", "Infinity"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.13667230773906688E18, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2.1366723077390668E19"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.1366723077390668E19, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2.1366723077390668E19"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "4"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "NaN", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.1366723077390668E19, getIterationCount=4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2.1366723077390668E19"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "4"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "NaN", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.1366723077390668E19, getIterationCount=4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-1.0683361538695334E19"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "4"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "NaN", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.0683361538695334E19, getIterationCount=4, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623155E308", "Infinity", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=Infinity, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"49.0", "1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "Infinity", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=49.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-2136672307739067002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.7976931348623157E308", "1.0E-6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.41000000000000003", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.41000000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.41000000000000003", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.41000000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"4.1000000000000005", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.1000000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1091761611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:5>"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-2136672307739067002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "0.0", "<sample:5>"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.13667230773906688E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-1302627263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!IllegalSt...#213#-820934313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!IllegalSta...#212#424130324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "55.5", "Infinity", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "1.0000000000000004", "-2.13667230773906688E18"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-47.35", "1.2700000000000005", "2.13667230773906714E18"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "2.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-1.7976931348623157E308", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "2.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-1.7976931348623157E308", "<sample:6>"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.0", "0.5"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.5", "Infinity"}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.5", "-1.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "0.0", "1.0E-6"}, {"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "0.0", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "-1.0", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-2136672307739067002", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.7976931348623157E308", "10"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.5", "10"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.5", "10"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.5", "9"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=9, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-0.5", "64"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=64, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"1.5", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"35.5", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("35.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"35.49999999999999", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("35.49999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"35.28999999999999", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("35.28999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-8.988465674311579E307, getResult=!IllegalSta...#212#-1058544715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=8.988465674311579E307, getResult=!IllegalStat...#211#-1434023336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcept...#204#300000847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.05", "6.9"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "10"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "NaN", "0.5", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "2.0", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "3"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "2.0", "-1.013"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "2.0", "0.0", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5000000231628418}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "2.0", "0.0", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"8"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=8, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-8"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-8, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-8"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "5.0"}, {"org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=5.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=-8, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-723179596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=2.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.2, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-15.8"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-15.8, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=0.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0", "-2136672307739067002", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0", "-2136672307739067002", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=NaN, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "-61"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-61, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "2.0", "-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "0.0", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "2.0", "-2136672307739067002", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.42444820515938048E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0", "5.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0", "5.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0", "5.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6666667693023682", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.6666667693023682}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-5.2", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.2999999529953006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.2999999529953006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-5.2", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "-1.7976931348623157E308", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "1.7976931348623157E308", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "Infinity", "-1.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.666666530883789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "1.5", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "-2147483648"}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "1.5", "-1.7976931348623157E308"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "-1073741824"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "1.5", "-1.7976931348623157E308"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5000000000000002", "-1073741824"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.5", "NaN", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "Infinity", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "Infinity", "0"}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-0.78"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.78, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "1.0", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "Infinity", "1.0", "0.5"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.5", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.0", "1.0E-6", "0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.16666719755172726", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.16666719755172726}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.5", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"NaN", "-2147483599"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "1.0", "7.5"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "NaN", "NaN", "52.58"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483599, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"NaN", "-2147483648"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.5", "-1.7976931348623157E308", "<sample:4>"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "NaN", "NaN", "52.58"}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "2.0", "1.0E-6", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "5.0", "2.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "5.0", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.7976931348623157E308", "-2.13667230773906714E18", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.7976931348623157E308", "Infinity", "<sample:6>"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "1.5", "Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"4.2733446154781336E19", "1.5", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "5.0"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "0.0", "-0.9999999999999999"}, {"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0E-6", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "Infinity", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0E-6", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-Infinity", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "-5.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.5", "-1.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.6666661975498199}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-14"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-14, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "4.513"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#1302037727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"27.28", "-4.513"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "21"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.76", "-0.1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "clearResult", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "0.5", "0.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "1.7976931348623157E308", "-2136672307739067002"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.13667230773906688E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.13667230773906688E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-2136672307739067002"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-2.13667230773906688E18, getResult=!IllegalSt...#213#-425134289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.06833615386953344E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-1.06833615386953344E18, getResult=!IllegalSt...#213#1116169347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-Infinity", "8.988465674311579E307", "1.5"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "0.47000000000000003", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=0.47000000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000006898298265", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5000006898298265}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "8.988465674311579E307"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.0", "2.0", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=8.988465674311579E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "8.988465674311579E307"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.0", "2.0", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "9.999999999999999E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.999999999999999E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=8.988465674311579E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=9.999999999999999E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.0", "2.0", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "9.999999999999999E-6", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000066898326874", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5000066898326874}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "2.0", "1.4100000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "9.999999999999999E-6", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000066898326874", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5000066898326874}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.13667230773906688E18", "2.0", "1.4100000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "9.999999999999999E-6", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.8033334582214358", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.8033334582214358}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.13667230773906688E18", "2.0", "1.4100000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2136672307739067002", "9.999999999999999E-6", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4100000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.4100000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.13667230773906688E18", "2.0", "0.7050000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7050000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.7050000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.13667230773906688E18", "2.0", "0.7050000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5683332450027465", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5683332450027465}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-2.13667230773906688E18", "4.0", "0.7050000000000001"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.9016666429405213", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.9016666429405213}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "5.0", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "5.0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.5", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-24.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-24.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-48.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-48.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-30.0", "-4.9E-324", "-3.170000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "verifyInterval", "double,double", "Infinity", "2.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-1.0", "Infinity", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-1.0", "Infinity", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.0E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-1.0", "Infinity", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.0000000000000002E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-1.0", "Infinity", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.0000000000000002E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-0.969", "-2136672307739067002", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "1.0000000000000002E-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStat...#211#-1198307578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "0.5", "1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.5", "1.0E-6", "<sample:4>"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-5.750000000000001"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-5.750000000000001, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateE...#209#700111336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2136672307739067002", "2.0", "1.0E-6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3333338024492265", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.3333338024492265}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "2.0", "-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000231628419", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0000000231628419}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "2.0", "-4.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.3162841796874977E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.3162841796874977E-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "2.0", "-4.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.3162841796874977E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.3162841796874977E-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.13667230773906714E18", "-2.0", "-4.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "Infinity", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.666666530883789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.666666530883789}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "2.0", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6666665308837891", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.6666665308837891}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "2.0", "0.946"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.648666501724243", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.648666501724243}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "2.0", "0.9460000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6486665017242434", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.6486665017242434}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-2.0", "0.9460000000000001"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0180000317459108", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0180000317459108}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-4.0", "0.9460000000000001"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.3513332264060973", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.3513332264060973}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.4", "0.9460000000000001"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.04866673878479005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.04866673878479005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.8", "0.9460000000000001"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.21800005503845224", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.21800005503845224}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.8", "0.9460000000000002"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.21800005503845218", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.21800005503845218}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.4", "9.46"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.5", "<sample:0>"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8866665584678652", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.8866665584678652}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.4", "4.73"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.5", "<sample:0>"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3100000923042303", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.3100000923042303}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "-0.4", "NaN"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.5", "<sample:0>"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"NaN", "0.4", "NaN"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "2.0", "2.0"}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.5", "<sample:0>"}, {"org.apache.commons.math.analysis.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.0683361538695332E20"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "0.0", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.0683361538695332E20, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSta...#212#-1254558461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-5.341680769347666E19"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "0.0", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-5.341680769347666E19, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStat...#211#-325711090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-2.670840384673833E19"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "0.0", "<sample:4>"}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.670840384673833E19, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStat...#211#574732317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-0.5", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-723179596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"9.31"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=9.31, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.5"}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-0.01", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.5, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.504"}, {"org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-0.01", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.504, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-5.0", "2.5E-7", "<null>"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "5.0", "-1.0", "1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "2.0", "1.0", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "verifySequence", "double,double,double", "Infinity", "10.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "0.5", "0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3333334691162109", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.3333334691162109}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "0.514", "0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34266682025146483", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.34266682025146483}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "0.514", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-2136672307739067002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1091761611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-2.13667230773906688E18"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#1091761611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-8.5466892309562675E18"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-40.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623158E307"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623158E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-1370247861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "3.5953862697246315E307"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.5953862697246315E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-1385519856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=2.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-4.9"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-4.9, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-2.5"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=-2.5, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateExcep...#205#1302037727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0", "2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "NaN", "Infinity"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "NaN", "Infinity"}, {"org.apache.commons.math.analysis.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "2.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-10, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "-10"}, {"org.apache.commons.math.analysis.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "1.7976931348623157E308", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=-10, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "1.0", "1.0E-6"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-8.988465674311579E307", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-2136672307739067002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-2.13667230773906688E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-2.13667230773906688E18, getR...#229#1329500245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "1.0", "1.0E-6"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-4.2733446154781338E18"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-8.988465674311579E307", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "-2136672307739067002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-4.2733446154781338E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=-2.13667230773906688E18, getRe...#228#-1424489746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "1.0", "1.0E-6"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-4.2733446154781338E18"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-8.988465674311579E307", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "1.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-4.2733446154781338E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-6, getResult=!IllegalStat...#211#1603836394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "1.0", "1.0E-6"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "-4.2733446154781338E18"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "-8.988465674311579E307", "-1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "5.0E-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=-4.2733446154781338E18, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=5.0E-7, getResult=!IllegalStat...#211#106462797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "2.0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0E-6", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-20.68", "-2.0", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "15.0", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-20.68", "-2.0", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "15.0", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "8.988465674311579E307", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-20.68", "-2.0", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "15.0", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-20.68", "-2.0", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "15.0", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "1.0", "524290"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=524290, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.5", "-2.0", "<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "150.0", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "524290"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=524290, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "NaN", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.1099999999999999", "8.988465674311579E306", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double", "1.0E-6", "5.0"}, {"org.apache.commons.math.analysis.BrentSolver", "solve", "double,double,double", "-68.845", "-1.018", "0.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setMaximalIterationCount", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"3.5", "97.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=2.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-2136672307739067002", "6.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-1.0", "2.0", "1.0"}, {"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-1.0", "2147483647"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-2136672307739067002", "60.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setResult", "double,int", "-1.0", "2147483647"}, {"org.apache.commons.math.analysis.BrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setRelativeAccuracy", "double", "5.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=5.0, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-1.7976931348623157E308", "1.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1984620899082121E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.1984620899082121E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "-1.7976931348623157E308", "0.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1984620899082121E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=1.0E-15, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.1984620899082121E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setFunctionValueAccuracy", "double", "5.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValueAccuracy=5.0, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalStateException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2136672307739067002"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-1.0", "1.5", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.13667230773906688E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalS...#214#-152242820", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2.13667230773906714E18"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-18.0", "1.5", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.13667230773906714E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalS...#214#1743557912", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.BrentSolver", "org.apache.commons.math.analysis.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.BrentSolver", "setAbsoluteAccuracy", "double", "-2.1366723077390672E17"}, {"org.apache.commons.math.analysis.BrentSolver", "isSequence", "double,double,double", "-18.0", "1.5", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-2.1366723077390672E17, getFunctionValueAccuracy=1.0E-15, getIterationCount=!IllegalStateException, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!IllegalSt...#213#-407693220", SearchInputFactory_scaffolding.receiverState());
 }
}
