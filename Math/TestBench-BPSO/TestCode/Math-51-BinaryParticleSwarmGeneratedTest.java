package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0E-6", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "-0.012001", "1.0E-6", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479549", "<sample:2>", "NaN", "NaN", "-10.0", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147479549, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"35", "<sample:6>", "0.10000000000000002", "-1.7976931348623157E308", "-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:3>", "Infinity", "1.0E-7", "-1.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=35, getMin=0.10000000000000002, getRelativeAccuracy=1.0E-14, getStart...#211#18418432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-0.024002", "0.029999", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.117582368135751E-21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=5, getFunctionValueAccuracy=1.0E-15, getMax=0.029999, getMaxEvaluations=2147483647, getMin=-0.024002, getRelativeAccuracy=1.0E-14, getStartValue=0.002998500...#210#-970120630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479573", "<sample:8>", "-0.027999000000000003", "0.5000000000000001", "1.0E-7", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479531", "<sample:6>", "-0.5", "0.4670000000000001", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:3>", "2.07999", "39.54"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.893726553732448E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.4670000000000001, getMaxEvaluations=2147479531, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=-0.016...#215#-1951688187", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-8", "-0.657999", "-10.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.0000000000000002"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:10>", "-1.0", "9.999999999999997E-7", "-0.1", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:9>", "-0.027999000000000003", "-0.10000000000000002", "0.05000000000000001", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479551", "<sample:6>", "-3.74", "9.999999999999998E-8", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "-0.5", "9.999999999999997E-8", "0.029999", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999997E-8, getMaxEvaluations=2147483647, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=0.02...#205#13611213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "4101", "<sample:4>", "-1.2999990000000001", "1.300001", "-0.10000000000000002", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:2>", "9.999999999999997E-8", "1.0000000000000003E-5", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.0000000000000003E-5, getMaxEvaluations=2147483647, getMin=9.999999999999997E-8, getRelativeAccuracy=1.0, g...#234#100526530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479610", "<sample:6>", "-0.1", "0.49799899999999997", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.781047706142743E-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.49799899999999997, getMaxEvaluations=2147479610, getMin=-0.1, getRelativeAccuracy=1.0E-14, getStartValue=0.198...#215#1294860673", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "1073741812", "<sample:10>", "-1.0000000000000002", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "32838", "<sample:5>", "-62.0", "0.25000000000000006", "9.999999999999997E-8", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.25000000000000006, getMaxEvaluations=32838, getMin=-62.0, getRelativeAccuracy=1.0E-14, getStartValue=9.9999999...#212#1605721387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"167772159", "<sample:4>", "-2.07999", "9.999999999999997E-7", "0.1", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:8>", "4.4299998999999985", "0.6499995000000001", "-10.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5783682913117088E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=5, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999997E-7, getMaxEvaluations=167772159, getMin=-2.07999, getRelativeAccuracy=1.0E-14, getStartValue=0...#203#-62987655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"35", "<sample:10>", "-0.024002", "1.0E-6", "-0.0", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4398112537251138E-22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=35, getMin=-0.024002, getRelativeAccuracy=1.0E-14, getStartValue=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:10>", "-0.49799899999999997", "10.5", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.29434858649082396", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=81, getFunctionValueAccuracy=1.0E-15, getMax=10.5, getMaxEvaluations=2147483647, getMin=-0.49799899999999997, getRelativeAccuracy=0.0, getStartValue=5.0010005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:10>", "-9.999999999999998E-8", "0.0030000099999999996", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.24000000000000005", "-0.020000050000000002", "-62.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.4998943807272873E-13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.0030000099999999996, getMaxEvaluations=2147483647, getMin=-9.999999999999998E-8, getRelativeAccuracy=1.0, ge...#234#-90526470", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479551", "<sample:10>", "-0.09999999999999999", "4.15998", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:9>", "29.000001", "-5.0E-8", "Infinity", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.515773388859195E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=12, getFunctionValueAccuracy=1.0E-15, getMax=4.15998, getMaxEvaluations=2147479551, getMin=-0.09999999999999999, getRelativeAccuracy=1.0E-14, getStartValue=...#219#1639286156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:4>", "-1.7976931348623157E308", "-1.7976931348623155E308", "-1.0", "<sample:7>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-59", "<null>", "5.0E-7", "-1.7976931348623157E308", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:7>", "-Infinity", "-8.988465674311579E307", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:8>", "0.5000000000000001", "-1.05", "1.7976931348623155E307", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2", "<sample:7>", "NaN", "-1.0000000000000002", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.05"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0", "-57.000001"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2", "<sample:7>", "-3.3000000000000003", "0.0", "2.0", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2, getMin=-3.3000000000000003, getRelativeAccuracy=1.0E-14, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.022999000000000006", "NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "0", "<sample:8>", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=0, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1073741812", "<sample:8>", "-0.5", "0.09999999999999999", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.09999999999999999, getMaxEvaluations=-1073741812, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=-0.2...#201#879268307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.012001", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483643", "<sample:9>", "-7.999999", "3.595386269724631E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073739775", "<sample:3>", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1073739775, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.0340000000000003", "-2.0", "1.7976931348623153E307"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479588", "<sample:4>", "1.7976931348623155E307", "0.5", "0.0", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "Infinity", "-10.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147479588, getMin=1.7976931348623155E307, getRelativeAccuracy=1.0E-14, getStartValue=0.0...#201#1374482483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-0.3299995"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "-Infinity", "Infinity", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.5", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"20.999999999999996"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "-1.7976931348623158E307", "-1.0000000000000004", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000004, getMaxEvaluations=2147483647, getMin=-1.7976931348623158E307, getRelativeAccuracy=1.0E-14, ge...#235#-1849241561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623155E307", "1.9999999999999995E-6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "52.0", "-1.7976931348623157E308", "0.9999999999999999"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-4.9E-324", "-Infinity", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:11>", "-0.012001", "0.5", "-0.1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "131074", "<sample:5>", "-0.5000000000000001", "-1.05", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.05, getMaxEvaluations=131074, getMin=-0.5000000000000001, getRelativeAccuracy=1.0E-14, getStartValue=-1.79769...#216#-1364788836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.5000000000000001", "1.0000000000000004E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "46", "<sample:7>", "-1.7976931348623157E308", "-1.0E-6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=-1.0E-6, getMaxEvaluations=46, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-8.988...#217#-2033569012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"Infinity", "-30.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479551", "<sample:9>", "-10.014", "1.7976931348623155E308", "0.5000000000000001", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "73", "<sample:5>", "-Infinity", "0.05000000000000001"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.05000000000000001", "-1.3000000000000003"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "Infinity", "-1.7976931348623155E308", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:5>", "-11.8", "-1.7976931348623157E308", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartVal...#207#338362206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:5>", "-1.7976931348623157E308", "0.1700000000000001", "1.7976931348623158E307", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-4.39", "-1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "2.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623155E307"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479551", "<sample:4>", "1.0E-6", "Infinity", "-10.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=Infinity, getMaxEvaluations=2147479551, getMin=1.0E-6, getRelativeAccuracy=1.0, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "31.4939995", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:10>", "1.7976931348623155E307", "1.7976931348623155E307"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623155E307, getMaxEvaluations=10, getMin=1.7976931348623155E307, getRelativeAccuracy=1.0E-14, getSta...#231#450199664", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-10.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.041", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:11>", "-Infinity", "-1.0", "0.1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:8>", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:4>", "-1.0000000000000001E-7", "0.20000000000000004", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147217405", "<sample:0>", "Infinity", "2.0000000000000004", "8.988465674311579E307", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000004, getMaxEvaluations=2147217405, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=8....#220#-148969571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<null>", "Infinity", "Infinity", "-0.1"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623155E307", "0.5", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-10", "<sample:9>", "-1.7976931348623157E308", "2.0", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-4", "<sample:3>", "-0.012001", "-1.0E-323", "-1.0E-6"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "536870911", "<sample:10>", "0.09999999999999999"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=536870911, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.09999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479571", "<sample:2>", "1.7976931348623157E308", "-Infinity", "-1.0000000000000002", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:5>", "-1.05", "1.0", "0.9999999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147479571, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartVal...#223#587446286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479571", "<sample:7>", "-1.0", "0.053001", "NaN", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.053001, getMaxEvaluations=2147479571, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.5000000000000001", "0.20000000000000007"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1073739774", "<sample:3>", "1.7976931348623157E308", "0.5", "-1.7976931348623155E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483594", "<sample:5>", "1.0E-6", "-0.01", "-10.0", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.01, getMaxEvaluations=2147483594, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.10000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0", "0.5"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2", "<sample:8>", "1.0", "8.988465674311578E307", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"35", "<sample:6>", "0.10000000000000002", "-1.05", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:9>", "1.7976931348623155E307", "9.999999999999998E-8", "3.595386269724631E307"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2", "<sample:3>", "95.0", "2.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.0E-6, getMaxEvaluations=2, getMin=95.0, getRelativeAccuracy=1.0E-14, getStartValue=47.500001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2", "<sample:7>", "-1.7976931348623157E308", "0.01", "0.49999999999999994"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.01, getMaxEvaluations=-2, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.4999999...#211#329278352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.012001", "3.5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-0.4940000000000001", "0.20000000000000007"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "70", "<sample:5>", "-10.0", "10.5", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=10.5, getMaxEvaluations=70, getMin=-10.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623153E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.05", "1.7976931348623155E307", "-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "Infinity", "Infinity", "-0.024002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479493", "<sample:8>", "-63.012001", "1.7976931348623155E308", "-0.10000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-63.012001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=1.7976931348623155E308, getMaxEvaluations=2147479493, getMin=-63.012001, getRelativeAccuracy=Infinity, getStartV...#226#-256179617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"4.9E-324", "-6.4", "-0.05"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "-0.1"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:3>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147479551", "<null>", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "2.0000000000000004", "1.0000000000000002", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "20", "<sample:5>", "1.7976931348623157E308", "0.2", "9.999999999999997E-6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.476", "0.5000000000000001", "9.999999999999997E-7"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "Infinity", "-8.988465674311577E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1073741812", "<null>", "1.0E-6", "0.0", "1.0E-6", "<sample:9>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.012001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"1", "<sample:6>", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "0.49999999999999994", "0.5"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<sample:6>", "1.0000000000000002E-6", "NaN", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "Infinity", "-0.0012001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-50.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-1", "<sample:1>", "Infinity", "-8.988465674311578E307"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "-1.0", "-8.988465674311579E307", "-Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-8.988465674311579E307, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-I...#208#-891973024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:7>", "Infinity", "-37.012001000000005", "1.7976931348623157E308", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-37.012001000000005, getMaxEvaluations=10, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931...#214#-71066495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-0.5000000000000001", "-1.05", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479599", "<sample:7>", "-0.5", "0.525", "-20.0", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.525, getMaxEvaluations=2147479599, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=-20.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147479549", "<sample:5>", "Infinity", "NaN", "-1.7976931348623155E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.25", "-0.0060005"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"21", "<sample:4>", "1.7976931348623157E308", "Infinity", "-Infinity", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=21, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-Infin...#204#480587648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-5.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0000000000000002", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "3.587999", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623155E307", "0.05000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-61", "<sample:9>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-61, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-0.023", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-14", "<sample:4>", "0.5", "-Infinity", "-1.0E-6"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1073741810", "<sample:4>", "-1.0", "NaN", "-1.7976931348623155E308", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:3>", "1.7976931348623157E308", "1.7976931348623153E307", "-Infinity", "<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2", "<sample:6>", "9.999999999999997E-7", "-1.092", "-1.9999999999999998"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-2147483648", "<null>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "8.988465674311578E306", "1.7976931348623153E307", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"41", "<sample:7>", "Infinity", "NaN", "-1.0", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2", "<sample:3>", "-0.024002", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=41, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.012001000000000001", "60.987999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "4.1000000000000005", "3.595386269724631E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:11>", "-0.012001000000000001", "-1.7976931348623155E308", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0000000000000002", "4.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=2147483647, getMin=-0.012001000000000001, getRelativeAccuracy=1.0E-14...#239#954670263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "NaN", "0.012001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<null>", "1.7976931348623155E308", "-0.012001", "1.7976931348623155E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623155E308", "-5.0E-7", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-5", "<sample:5>", "-1.7976931348623155E308", "-2.0999990000000004", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-2.0999990000000004, getMaxEvaluations=-5, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStart...#210#-1772851462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:6>", "-1.7976931348623157E308", "-8.988465674311578E307", "<null>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-56", "<sample:5>", "0.5", "-1.7976931348623155E308", "-Infinity", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=-56, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity...#201#-762747980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-0.0019999999999999983"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479513", "<sample:4>", "Infinity", "-5.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-5.0, getMaxEvaluations=2147479513, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:0>", "0.0", "1.0E-6", "1.0E-5", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "1.7976931348623157E308", "0.0", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623153E308", "0.10000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "8191", "<sample:3>", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "32", "<sample:8>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=32, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479551", "<sample:11>", "-1.7976931348623155E308", "1.7976931348623155E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-2.0000000000000004", "-0.0012000999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147479551", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623155E307, getMaxEvaluations=2147479551, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-1...#241#800746402", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.5", "0.10000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "262274", "<sample:4>", "-0.609999", "-0.05", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.05, getMaxEvaluations=262274, getMin=-0.609999, getRelativeAccuracy=1.0E-14, getStartValue=-0.3299995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:2>", "Infinity", "-0.5000000000000001", "-1.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.5000000000000001, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-...#205#-957039722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623153E307", "1.7976931348623155E308", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:9>", "0.953"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.18", "0.25", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.953}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "8388607", "<sample:2>", "-0.016002", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.016002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=8388607, getMin=-0.016002, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-3.7", "-0.699999", "0.10000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.05", "-1.0499999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:9>", "-0.0", "-1.0000000000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=2147483647, getMin=-0.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.50...#215#129094502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147479551", "<sample:4>", "-1.7976931348623155E308", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147479551, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#-1270848230", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "4.0", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483614", "<sample:7>", "-10.0", "2.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.1, getMaxEvaluations=2147483614, getMin=-10.0, getRelativeAccuracy=1.0E-14, getStartValue=-3.95}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1073725428", "<sample:8>", "1.7976931348623157E308", "1.7976931348623157E308", "-0.012001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=1073725428, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14...#226#874004910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:0>", "1.7976931348623157E308", "Infinity", "-1.0460000000000003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValu...#222#-1843183657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "10.000000000000002", "-0.012001", "1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "12", "<sample:0>", "-1.0500000000000003", "0.10000000000000003", "-6.1000000000000005", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.10000000000000003, getMaxEvaluations=12, getMin=-1.0500000000000003, getRelativeAccuracy=1.0E-14, getStartValu...#222#1149463478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "-1.9999999999999998", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "5.0000000000000004E-8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "NaN", "NaN", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-5.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483633", "<sample:11>", "-1.0499999999999998", "1.0E-7", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147475455", "<sample:11>", "-1.7976931348623157E308", "-0.9999999999999999", "0.08200000000000002", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-0.9999999999999999, getMaxEvaluations=2147475455, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ...#234#-612922675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-0.1", "-0.01", "54.9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.01, getMaxEvaluations=2147483647, getMin=-0.1, getRelativeAccuracy=1.0E-14, getStartValue=54.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "0.5000000000000001", "9.999999999999997E-7", "-10.0", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:1>", "1.7976931348623157E308", "1.0", "-1.7976931348623157E308", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-1.79769313...#213#775752387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:4>", "0.08400000000000002"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08400000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.08400000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479551", "<sample:5>", "-0.984", "-1.7976931348623155E308", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=2147479551, getMin=-0.984, getRelativeAccuracy=1.0E-14, getStartValue...#210#-1022856789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.0E-6", "-45.5"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:5>", "-10.0", "Infinity", "-Infinity", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=Infinity, getMaxEvaluations=0, getMin=-10.0, getRelativeAccuracy=1.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0000000000000002E-6", "-1.0000000000000002E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-17", "<null>", "0.5", "-9.999999999999998", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:3>", "-1.7976931348623157E308", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=-2147483648, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E...#243#793331868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:5>", "0.5000000000000001", "Infinity", "-1.0000000000000002", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-2147483648, getMin=0.5000000000000001, getRelativeAccuracy=1.0E-14, getStartValue=-...#219#-13687051", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479603", "<sample:8>", "-Infinity", "-1.0", "-52.9", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147479603", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=2147479603, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-52.9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623155E307", "-0.5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:7>", "1.7976931348623157E308", "-9.999998999999999", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999998999999999, getMaxEvaluations=-2147483648, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, g...#232#583596897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479551", "<sample:8>", "Infinity", "-0.012001", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.012001, getMaxEvaluations=2147479551, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.2", "-0.87", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-10.023", "0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479549", "<sample:2>", "-0.9910000000000001", "1.0E-6", "1.7976931348623155E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=2147479549, getMin=-0.9910000000000001, getRelativeAccuracy=1.0E-14, getStartValue=1.7...#220#-824780427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "-1.0499999999999998", "NaN", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=-1.0499999999999998, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:0>", "-4.9E-324", "-Infinity", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147483647, getMin=-4.9E-324, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"35", "<sample:3>", "-1.7976931348623155E308", "-1.0E-7"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147479551", "<sample:6>", "1.0000000000000002", "-0.30000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "0.0800001", "-1.7976931348623153E308", "-1.7976931348623155E308", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.1", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "134217728", "<sample:4>", "1.0E-6", "-Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217728", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=134217728, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "524298", "<sample:5>", "-0.08399999999999999", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=524298, getMin=-0.08399999999999999, getRelativeAccuracy=1.0E-14, getStartValue=-0.041...#216#-1940249574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"39", "<sample:7>", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=39, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0000000000000002", "-0.29999990000000004", "0.5000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073739770", "<sample:8>", "-1.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=1073739770, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-1.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:7>", "-Infinity", "0.5", "-0.1"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-1073741812", "<null>", "-1.7976931348623155E308", "0.958"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.9999999999999999", "8.988465674311579E307", "-0.006999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1073870847", "<sample:0>", "Infinity", "0.013999500000000002", "26.9"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.013999500000000002, getMaxEvaluations=1073870847, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=...#205#1875346668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "-0.44000100000000003", "-0.0024002", "Infinity"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.0024002, getMaxEvaluations=-2147483648, getMin=-0.44000100000000003, getRelativeAccuracy=1.0E-14, getStartVal...#212#1384931036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1073739775", "<sample:7>", "-0.2", "-1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=-1073739775, getMin=-0.2, getRelativeAccuracy=1.0E-14, getStartValue=-0.6...#216#902375766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:10>", "0.0149995", "0.0050009999999999985", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147479572", "<null>", "-10.09", "40.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0050009999999999985, getMaxEvaluations=2147483647, getMin=0.0149995, getRelativeAccuracy=1.0E-14, getStartValu...#206#-1884658883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:8>", "NaN", "-5.0", "0.1"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2", "<sample:7>", "0.10000000000000002", "0.25"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.25, getMaxEvaluations=-2, getMin=0.10000000000000002, getRelativeAccuracy=Infinity, getStartValue=0.175}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:3>", "0.0", "1.0E-7", "-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:7>", "0.10000000000000003", "1.0E-7", "3.5953862697246305E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-7, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147479551", "<sample:6>", "-0.027999000000000003", "0.05000000000000001", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.759824041329242E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=5, getFunctionValueAccuracy=1.0E-15, getMax=0.05000000000000001, getMaxEvaluations=2147479551, getMin=-0.027999000000000003, getRelativeAccuracy=1.0E-14, ge...#216#1546279317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "35", "<sample:5>", "1.0000000000000002", "NaN", "NaN", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=35, getMin=1.0000000000000002, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2", "<sample:3>", "0.012001", "1.7976931348623157E308", "-1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2, getMin=0.012001, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976...#217#-1582963633", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147479549", "<sample:7>", "-1.7976931348623157E308", "0.0", "10.31"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "NaN", "1.7976931348623158E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:3>", "-1.7976931348623157E308", "0.0012001", "-0.055998000000000006"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147479549, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=10.31...#201#1474377427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:3>", "1.7976931348623157E308", "0.05", "0.27999"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.040000100000000004", "0.5", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "1.7976931348623157E308", "0.6400001", "-0.09999999999999999", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.6400001, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartVal...#224#-813025174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2", "<sample:4>", "-Infinity", "0.0119999", "-39.972001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-16384", "<sample:7>", "0.117998"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0119999, getMaxEvaluations=2, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-39.972001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.10000000000000002", "0.029998999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"70", "<sample:0>", "-1.05", "1.0E-6", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-0.5", "0.05000000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=70, getMin=-1.05, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.9999999999999999", "-Infinity"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.5000000000000001", "NaN", "-1.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1073739775", "<sample:5>", "0.0310001", "1.0E-6", "-0.024002000000000002", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=1.0E-6, getMaxEvaluations=1073739775, getMin=0.0310001, getRelativeAccuracy=Infinity, getStartValue=-0.024002000...#210#-641938391", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623155E307", "1.7976931348623155E307", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "-0.012000999999999998"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479549", "<sample:4>", "0.027999000000000003", "-Infinity", "23.95", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147479549, getMin=0.027999000000000003, getRelativeAccuracy=1.0E-14, getStartValue...#207#-834154297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "1.529999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479528", "<sample:1>", "-1.7976931348623155E308", "0.05000000000000001", "-0.027999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.05000000000000001, getMaxEvaluations=2147479528, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, ...#224#1772373449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:10>", "0.040000100000000004", "-0.012001", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.040000100000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.012001, getMaxEvaluations=2147483647, getMin=0.040000100000000004, getRelativeAccuracy=1.0E-14, getStartValue...#225#-1085566803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147481599", "<sample:7>", "-56.95", "0.5", "-0.027999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "-1.0499999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-56.95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147481599, getMin=-56.95, getRelativeAccuracy=1.0E-14, getStartValue=-0.027999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "1.7976931348623155E307", "-7.44002", "-1.0", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-7.44002, getMaxEvaluations=2147483647, getMin=1.7976931348623155E307, getRelativeAccuracy=1.0E-14, getStartValu...#207#1011381322", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:10>", "-10.0", "0.029999", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=0.029999, getMaxEvaluations=2147483647, getMin=-10.0, getRelativeAccuracy=Infinity, getStartValue=-4.9850005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:0>", "-8.988465674311579E307", "-0.1", "-0.0029990000000000017"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:6>", "5.0", "1.0000000000000002", "-0.1", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002, getMaxEvaluations=-2147483648, getMin=5.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:9>", "0.029999000000000005"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-22", "<sample:0>", "-0.004001999999999999", "1.0000000000000002", "0.040000100000000004"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-0.543", "1.7976931348623157E308", "0.375998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002, getMaxEvaluations=-22, getMin=-0.004001999999999999, getRelativeAccuracy=1.0E-14, getStartVa...#225#-414710606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-10", "<sample:5>", "4.829999000000002", "-0.704002", "0.2500001"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0E-6", "3.595386269724631E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.704002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-0.704002, getMaxEvaluations=-10, getMin=4.829999000000002, getRelativeAccuracy=1.0E-14, getStartValue=0.2500001...#201#-1555299461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1879048191", "<sample:1>", "0.05000000000000001", "0.012001", "1.7976931348623155E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879048191", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.012001, getMaxEvaluations=1879048191, getMin=0.05000000000000001, getRelativeAccuracy=1.0E-14, getStartValue=1...#222#1128103029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147479573", "<sample:1>", "1.0E-6", "1.7976931348623155E307", "-0.013999500000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.5", "9.999999999999998E-8", "1.0E-7"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"5", "<sample:4>", "Infinity", "-0.024002", "0.027999000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.024002, getMaxEvaluations=5, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=0.027999000000000003...#201#1537557797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147479551", "<sample:6>", "-1.7976931348623158E307", "0.0149995"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0149995, getMaxEvaluations=2147479551, getMin=-1.7976931348623158E307, getRelativeAccuracy=1.0E-14, getStartVa...#227#312771503", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-0.012001", "0.0", "-1.7976931348623153E307"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.012001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=-0.012001, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931348623...#208#-101912217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-0.012001", "8.988465674311578E306", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.029999"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "-0.00799995", "0.5000000000000001", "-0.024002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5000000000000001, getMaxEvaluations=10, getMin=-0.00799995, getRelativeAccuracy=1.0E-14, getStartValue=-0.024002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-60", "<sample:7>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-60", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=-60, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073739775", "<sample:7>", "0.0029999000000000002", "Infinity", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479544", "<sample:0>", "-1.7976931348623155E308", "4.9E-324", "-10.000000000000002", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0029999000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=1073739775, getMin=0.0029999000000000002, getRelativeAccuracy=1.0E-14, getStartValue...#210#1337062943", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-10", "<sample:7>", "0.050000000000000024"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.050000000000000024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.05"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:1>", "-15.027999000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-15.027999000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "-0.5000000000000001", "0.005"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147479549", "<sample:6>", "-0.040000100000000004", "-0.024002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147479549", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.024002, getMaxEvaluations=2147479549, getMin=-0.040000100000000004, getRelativeAccuracy=1.0E-14, getStartValu...#214#1149174323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:3>", "0.05", "NaN", "-0.01", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "1073741836", "<sample:10>", "2.017", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.017", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=1073741836, getMin=2.017, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147479549", "<sample:1>", "-0.092001", "-0.027999000000000003", "1.0E-7", "<sample:8>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.027999000000000003, getMaxEvaluations=2147479549, getMin=-0.092001, getRelativeAccuracy=0.0, getStartValue=1.0E-...#202#1096377857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623153E307"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:0>", "0.024002", "-4.7", "-0.024002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=-4.7, getMaxEvaluations=2147483647, getMin=0.024002, getRelativeAccuracy=Infinity, getStartValue=-0.024002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "-1.0E-7", "-9.629999999999999", "-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-9.629999999999999, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=-1....#202#-1274615392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:2>", "0.5", "NaN", "-Infinity", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073739775", "<sample:4>", "-0.034004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073739775", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1073739775, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-0.034004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"35", "<sample:12>", "1.7976931348623157E308", "1.7976931348623157E308", "-0.056999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=35, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getSta...#218#1450045933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147479573", "<sample:8>", "-0.012001", "-1.0000000000000002", "0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=2147479573, getMin=-0.012001, getRelativeAccuracy=1.0, getStartValue=0....#217#1746341022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:6>", "0.012001", "-1.0", "-0.024002", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-2147483648, getMin=0.012001, getRelativeAccuracy=1.0E-14, getStartValue=-0.024002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.012000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "273", "<sample:9>", "-8.988465674311578E307", "9.999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999998, getMaxEvaluations=273, getMin=-8.988465674311578E307, getRelativeAccuracy=1.0E-14, getStartVa...#227#-197525759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "Infinity", "1.7976931348623157E308", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=Infinity, getStartVal...#207#-1341140920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2", "<sample:5>", "0.10000000000000002", "-0.024002000000000002"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479551", "<sample:2>", "-1.7976931348623157E308", "Infinity", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-1.7976931348623157E308", "3.0000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147479551, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartVal...#212#-1902457488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147479549", "<sample:7>", "0.029999000000000005", "-Infinity", "0.10000000000000003", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.029999000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147479549, getMin=0.029999000000000005, getRelativeAccuracy=1.0E-14, getStartValue...#221#1937950554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"35", "<sample:3>", "0.029999", "-0.139", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:3>", "45.511", "-0.027999000000000003", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-0.027999000000000003, getMaxEvaluations=2147483647, getMin=45.511, getRelativeAccuracy=1.0E-14, getStartValue=2...#210#793035971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"81", "<sample:4>", "-0.525", "-0.27999", "<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479530", "<sample:0>", "-1.0000000000000002", "-0.0", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.27999"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "1.7976931348623155E307", "0.0010000000000000009", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10740622647169526", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=0.0010000000000000009, getMaxEvaluations=2147483647, getMin=1.7976931348623155E307, getRelativeAccuracy=Infinity...#238#-170406611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-10.0", "-0.027999000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0E-8"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:7>", "3.0000001", "0.71", "-0.013999500000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-9.98", "1.7976931348623155E307", "0.13"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.71, getMaxEvaluations=10, getMin=3.0000001, getRelativeAccuracy=1.0E-14, getStartValue=-0.013999500000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479573", "<sample:0>", "-0.024002", "0.049001", "-0.40000100000000005"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.024002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.049001, getMaxEvaluations=2147479573, getMin=-0.024002, getRelativeAccuracy=1.0E-14, getStartValue=-0.40000100...#210#780404843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "-1.0", "-0.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "66", "<sample:5>", "-1.05", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "3.6799900000000005", "0.9510000000000001", "-0.5000000000000001", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.9510000000000001, getMaxEvaluations=2147483647, getMin=3.6799900000000005, getRelativeAccuracy=1.0E-14, getSta...#228#-1803194779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.0149995"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "1.7976931348623157E308", "-Infinity", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartVal...#212#1040276230", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:5>", "-10.000000000000002", "-0.024001999999999996", "-2.0000000000000004"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.024001999999999996, getMaxEvaluations=1, getMin=-10.000000000000002, getRelativeAccuracy=1.0E-14, getStartValue=...#220#-1430610496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "9.999999999999997E-7", "0.20900000000000005"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"32", "<sample:3>", "39.54", "-0.5", "0.005"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:6>", "NaN", "-Infinity", "-0.9999999999999999"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:4>", "-1.7976931348623155E308", "-1.0000000000000002", "5.39999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0000000000000002, getMaxEvaluations=-1, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStart...#214#1793576389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "1.7976931348623157E308", "0.05", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.05, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=8....#220#1888405057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"163", "<sample:2>", "1.0E-6", "-1.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "16384", "<sample:5>", "0.05", "-10.0", "0.4670000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=163, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=-0.4999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483646", "<sample:6>", "-1.7976931348623155E308", "Infinity", "1.0E-7"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483646, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartVal...#210#-1272797337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.5", "2.0799900000000004"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.29999000000000003", "-0.9450000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:6>", "-2.07999", "1.041", "-0.048004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.8500000000000001"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-0.20000000000000004", "-0.00400001"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147479503", "<sample:2>", "-0.040000100000000004", "0.0", "0.27999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147479503, getMin=-0.040000100000000004, getRelativeAccuracy=1.0E-14, getStartValue=0.27...#204#-335834327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"10", "<sample:4>", "-1.0", "-1.7976931348623158E307"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623158E307, getMaxEvaluations=10, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-8.988465...#214#-1334712132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"18", "<sample:2>", "-Infinity", "-4.0", "0.0", "<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.0, getMaxEvaluations=18, getMin=-Infinity, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.20000050000000003", "155.07999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623155E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "0.025", "-4.9E-324"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"6", "<null>", "NaN", "-0.5", "<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
}
