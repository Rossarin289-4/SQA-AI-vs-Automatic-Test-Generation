package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "Infinity", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "-1.0", "0.25", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=7, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "Infinity", "8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "-0.5", "0.25", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=2147483647, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741771", "<sample:4>", "NaN", "330.42", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("330.42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=330.42, getMaxEvaluations=1073741771, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1048576", "<sample:4>", "-1.0000000000000002", "1.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "31", "<sample:0>", "NaN", "8.988465674311579E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=1048576, getMin=-1.0000000000000002, getRelativeAccuracy=1.0E-14, getStartValue=-2.220446...#214#95909332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:4>", "-1.0", "1.0E-6", "1.0", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:2>", "0.5", "Infinity", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "15", "<sample:4>", "-2.0", "1.0E-6", "0.5", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=10, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=15, getMin=-2.0, getRelativeAccuracy=-Infinity, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-0.035", "0.26385000000000003", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073741771", "<sample:7>", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.0", "0.65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.6693121243520998E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.26385000000000003, getMaxEvaluations=2147483647, getMin=-0.035, getRelativeAccuracy=1.0E-14, getStartValue=0.1...#217#-824329118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-0.035", "0.84385", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1073741771", "<sample:1>", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.0", "0.65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.058345805742701E-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.84385, getMaxEvaluations=2147483647, getMin=-0.035, getRelativeAccuracy=1.0E-14, getStartValue=0.4044250000000...#205#1263909955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483612", "<sample:6>", "-0.03200000000000001", "0.421925", "<sample:8>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.002734459060251271", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=0.421925, getMaxEvaluations=2147483612, getMin=-0.03200000000000001, getRelativeAccuracy=1.0, getStartValue=...#210#635788077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483612", "<sample:6>", "-5.732", "0.84385", "<sample:9>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.731995321918265", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=0.84385, getMaxEvaluations=2147483612, getMin=-5.732, getRelativeAccuracy=1.0, getStartValue=-2.444075}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "-0.03200000000000001", "0.84385", "<sample:8>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.4960821218641167E-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=7, getFunctionValueAccuracy=1.0E-15, getMax=0.84385, getMaxEvaluations=2147483647, getMin=-0.03200000000000001, getRelativeAccuracy=-Infinity, getStartValue=0...#208#1319814747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2130706358", "<sample:4>", "-0.006400000000000001", "0.84385", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0027075631130167865", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.84385, getMaxEvaluations=2130706358, getMin=-0.006400000000000001, getRelativeAccuracy=0.0, getStartValue=0.41872...#213#-170992456", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1048587", "<sample:4>", "-0.0354", "1.49754", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "0.421925", "0.65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.5475242460626455E-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=7, getFunctionValueAccuracy=1.0E-15, getMax=1.49754, getMaxEvaluations=1048587, getMin=-0.0354, getRelativeAccuracy=1.0E-14, getStartValue=0.731070000000000...#202#-2122059208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1879048191", "<sample:6>", "-0.008400000000000001", "0.6499999999999999", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.950870580409469E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=0.6499999999999999, getMaxEvaluations=1879048191, getMin=-0.008400000000000001, getRelativeAccuracy=1.0E-14, get...#230#-1069371376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:10>", "-0.084", "0.06499999999999999", "<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:0>", "0.65"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.89485", "8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.187467302773807E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0, getMax=0.06499999999999999, getMaxEvaluations=2147483647, getMin=-0.084, getRelativeAccuracy=-1.0, getStartValue=-0.0095000000...#209#1177978954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "537395200", "<sample:10>", "-0.016640000000000002", "0.615", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.016640000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=6, getFunctionValueAccuracy=Infinity, getMax=0.615, getMaxEvaluations=537395200, getMin=-0.016640000000000002, getRelativeAccuracy=0.0, getStartValue=0.29918}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-16", "<sample:4>", "-Infinity", "-9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "NaN", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999999999999999E-6, getMaxEvaluations=-16, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=Infin...#204#-659868304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:4>", "-Infinity", "-9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "NaN", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999999999999999E-6, getMaxEvaluations=-2147483648, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartVal...#212#-554378888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:4>", "Infinity", "-9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "NaN", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999999999999999E-6, getMaxEvaluations=-2147483648, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValu...#211#-362055033", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:4>", "Infinity", "1.7976931348623157E308", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "NaN", "-2.46"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-2147483648, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartVal...#212#787390888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:4>", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "1.0", "0.5", "-1.0", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:4>", "-1.7976931348623157E308", "0.8", "1.062"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "1.0", "-1.0", "NaN", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.8, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=1.062}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:3>", "-1.7976931348623157E308", "0.8", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "1.0", "-1.0", "NaN", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.8, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931...#214#-1674342345", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:3>", "1.7976931348623157E308", "0.8", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "1.0", "-1.0", "NaN", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.8, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-1.79769313...#213#-695974844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:3>", "1.7976931348623157E308", "-0.8", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "1.0", "-1.0", "NaN", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.8, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931...#214#-166195233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:3>", "1.7976931348623157E308", "-1.6", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.6, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931...#214#766156510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<null>", "1.7976931348623157E308", "-1.6", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-7", "<null>", "0.84"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-7", "<sample:2>", "0.84"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "NaN", "0.0", "1.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "NaN", "0.0", "1.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"62", "<sample:6>", "5.2", "2.0E-6", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-62", "<sample:8>", "0.52", "2.0E-6", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.5", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "-Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "31", "<sample:0>", "2.6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=31, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:1>", "-0.39", "Infinity", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "8.0", "NaN", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "2.6", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=8.0, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:1>", "-0.39", "Infinity", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "8.0", "NaN", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "2.6", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=10, getMin=8.0, getRelativeAccuracy=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:1>", "-0.39", "Infinity", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "8.0", "NaN", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "2.6", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=8.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:1>", "-0.39", "Infinity", "-1.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "8.0", "NaN", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=8.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:5>", "0.0", "2.6", "-1.7976931348623157E308", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-998", "<null>", "-0.5", "-0.139995", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:0>", "0.5", "2.6", "NaN", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:7>", "0.0", "0.5", "0.5", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=31, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:7>", "0.0", "0.5", "0.5", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=31, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "0.7"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.25", "1.0", "0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "2.6", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.25", "2.6", "2.6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.0", "Infinity", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.0", "Infinity", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.0", "Infinity", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "0.5", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<null>", "-1.7976931348623157E308", "1.0E-6", "NaN", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"306.35", "1.0E-6"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:5>", "0.0", "-1.7976931348623157E308", "-47.5", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "0.0", "-1.7976931348623157E308", "-47.5", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=-47....#202#-589916866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "0.0", "-1.7976931348623157E308", "-47.5", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=-47.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "0.0", "1.0", "-47.5", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "1.0", "-47.5", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=-47.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "1.004", "-47.5", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.004, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=-47.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "1.004", "-4.75", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<sample:6>", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.004, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=-4.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-2147483648", "<sample:2>", "-0.25", "0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:2>", "-0.25", "-0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.25, getMaxEvaluations=2147483647, getMin=-0.25, getRelativeAccuracy=1.0E-14, getStartValue=-0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<sample:2>", "-0.25", "-0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.25, getMaxEvaluations=2147483615, getMin=-0.25, getRelativeAccuracy=1.0E-14, getStartValue=-0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<sample:0>", "-0.25", "-0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<null>", "-0.25", "-0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<sample:2>", "0.5", "-0.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.5, getMaxEvaluations=2147483615, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=Infinity, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=0.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "2.6", "-1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=-1.0, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "8", "<sample:1>", "2.6", "-1.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=Infinity, getMax=-1.0, getMaxEvaluations=8, getMin=2.6, getRelativeAccuracy=0.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:6>", "1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:4>", "-1.7976931348623157E308", "1.0E-6", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=0, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infinity...#201#-1566446550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-16", "<sample:4>", "-1.7976931348623157E308", "1.0E-6", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=-16, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infini...#203#-1609013428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-16", "<sample:4>", "-1.7976931348623157E308", "9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.9000000000000001", "NaN", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=9.999999999999999E-6, getMaxEvaluations=-16, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getSta...#217#1186557245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-16", "<sample:4>", "-1.7976931348623157E308", "-9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.9000000000000001", "NaN", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999999999999999E-6, getMaxEvaluations=-16, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getSt...#218#-1711803560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-16", "<sample:4>", "-Infinity", "-9.999999999999999E-6", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "NaN", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-9.999999999999999E-6, getMaxEvaluations=-16, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=Infin...#204#-659868304", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "0.0", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.0", "1.0", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "38.0", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=38.0, getRelativeAccuracy=1.0E-14, getStartValue=19.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "38.0", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=38.0, getRelativeAccuracy=1.0E-14, getStartValue=19.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:0>", "1.0E-6", "Infinity", "NaN", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "1.7976931348623157E308", "0.5", "Infinity", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Inf...#206#-763810843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<null>", "1.7976931348623157E308", "-1.6", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "1.0E-6", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"1", "<null>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:5>", "1.0", "1.7976931348623157E308", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-14", "<sample:2>", "0.84"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "1.7976931348623157E308", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:6>", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:0>", "1.0E-6", "-1.7976931348623157E308", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "NaN", "0.0", "5.0E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=5.0E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:6>", "NaN", "0.0", "5.0E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=5.0E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:6>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:6>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:6>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "NaN", "0.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:3>", "0.0", "0.5", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"63", "<sample:3>", "0.0", "0.5", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"31", "<sample:6>", "0.0", "0.25", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=31, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"31", "<sample:6>", "0.52", "0.25", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"31", "<sample:6>", "2.6", "1.0E-6", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "NaN", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.5", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.5", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.5", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.0", "0.5", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "Infinity", "2.6", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.25"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "-0.25"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.7976931348623157E308", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "0.25"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "0.25"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "-Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "-Infinity", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "31", "<sample:0>", "2.6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=31, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<null>", "-1.7976931348623157E308", "2.6", "0.0", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:6>", "-1.7976931348623157E308", "2.6", "0.0", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:6>", "-1.7976931348623157E308", "2.6", "0.0", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:6>", "-1.7976931348623157E308", "-36.4", "0.0", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-36.4, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:6>", "-1.7976931348623157E308", "-36.4", "0.0", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-36.4, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:6>", "0.0", "-36.4", "0.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-36.4, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-10", "<sample:6>", "0.0", "-36.4", "0.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:6>", "0.25", "0.25", "0.0", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=10, getMin=0.25, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:6>", "0.25", "0.25", "0.0", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=10, getMin=0.25, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:5>", "2.6", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=10, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "NaN", "-1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:0>", "NaN", "1.0E-6", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0E-6", "26.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:1>", "-1.0", "NaN", "NaN", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-2147483648, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623158E307", "26.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:1>", "-1.0", "NaN", "NaN", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-2147483648, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:2>", "2.6", "2.6", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=0, getMin=2.6, getRelativeAccuracy=1.0E-14, getStartValue=2.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "Infinity", "2.6", "-1.7976931348623157E308", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:4>", "2.6", "2.6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=0.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "NaN", "2.6", "-1.7976931348623157E308", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:4>", "2.6", "2.6", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<null>", "-1.7976931348623157E308", "0.25", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.7976931348623157E308", "NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.7976931348623157E308", "NaN"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-2.0", "Infinity", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "1.0", "0.5", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "0.5", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<null>", "-1.7976931348623157E308", "1.0E-6", "NaN", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "0.5000000000000001", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-127", "<null>", "-1.7976931348623157E308", "1.0E-6", "NaN", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5000000000000001, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25000...#213#1017208535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741823", "<sample:2>", "0.0", "0.5000000000000001", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-127", "<null>", "-1.7976931348623157E308", "1.0E-6", "NaN", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5000000000000001, getMaxEvaluations=1073741823, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25000...#213#1418449795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "0.0", "2.6", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-127", "<null>", "-1.7976931348623157E308", "1.0E-6", "NaN", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=1.3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"109.48500000000001", "NaN"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.25", "0.25", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:4>", "0.0", "0.0", "2.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=1, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=2.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.25", "0.25", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:4>", "-0.0", "0.0", "2.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=1, getMin=-0.0, getRelativeAccuracy=1.0E-14, getStartValue=2.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:7>", "0.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"53", "<sample:7>", "0.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=53, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"53", "<sample:3>", "0.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<sample:3>", "0.5", "-0.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483615", "<sample:3>", "0.5", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:4>", "1.0E-6", "-1.7976931348623157E308", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=1.797693...#215#1549655201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:4>", "1.0E-6", "-1.7976931348623157E308", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=1.797693134...#212#-205471660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "-8.988465674311579E306", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:6>", "0.25", "0.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.125", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=1, getMin=0.25, getRelativeAccuracy=1.0E-14, getStartValue=0.125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:5>", "0.25"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "2.0", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-2147483647", "<sample:6>", "1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147479551", "<sample:7>", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147479551, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147479551", "<sample:7>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147479551, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1", "<sample:4>", "1.0E-6", "Infinity", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "31", "<sample:3>", "Infinity", "-1.7976931348623157E308", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=31, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:7>", "0.25", "2.6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=10, getMin=0.25, getRelativeAccuracy=1.0E-14, getStartValue=1.425}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "0.1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:7>", "0.24999999999999997", "2.6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=10, getMin=0.24999999999999997, getRelativeAccuracy=1.0E-14, getStartValue=1.425}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"NaN", "7.640000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:7>", "0.24999999999999997", "2.5999999999999996"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.5999999999999996, getMaxEvaluations=10, getMin=0.24999999999999997, getRelativeAccuracy=1.0E-14, getStartValue...#220#-1660058038", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"8.0", "0.5"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:7>", "0.24999999999999997", "2.5999999999999996"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.5999999999999996, getMaxEvaluations=10, getMin=0.24999999999999997, getRelativeAccuracy=-1.0, getStartValue=1.424...#214#-69520823", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-6"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.25", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ...#219#-348522886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-6"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "-1.7976931348623155E308", "1.7976931348623157E308", "0.25", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, ...#219#-1735308296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:3>", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=-Infinity, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"31", "<sample:3>", "-1.0", "26.0", "1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "2.6", "0.316"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "0.25", "0.316"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "0.25000000000000006", "0.31600000000000006"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:3>", "0.5", "Infinity", "Infinity", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:2>", "0.3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.0", "1.7976931348623157E308"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.0", "8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "8.988465674311579E307", "8.988465674311579E307", "0.25"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:0>", "Infinity", "8.988465674311579E307", "Infinity"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-0.5", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-0.5", "2.6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-1.0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "0.5", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:3>", "-1.7976931348623157E308", "2.6", "1.0E-6", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=-2147483648, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=1...#206#1820877993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "2.6", "0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "2.6", "-1.7976931348623157E308", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-15", "<sample:4>", "2.6", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:5>", "1.0E-6"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"15", "<sample:4>", "-26.0", "9.999999999999999E-6"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-26.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=Infinity, getMax=9.999999999999999E-6, getMaxEvaluations=15, getMin=-26.0, getRelativeAccuracy=0.0, getStartValue=-12.999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"15", "<sample:4>", "-26.0", "1.9999999999999998E-5"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-26.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=Infinity, getMax=1.9999999999999998E-5, getMaxEvaluations=15, getMin=-26.0, getRelativeAccuracy=0.0, getStartValue=-12.99999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"15", "<sample:4>", "-22.6", "1.9999999999999998E-5"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-0.5", "0.5670000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-22.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=Infinity, getMax=1.9999999999999998E-5, getMaxEvaluations=15, getMin=-22.6, getRelativeAccuracy=0.0, getStartValue=-11.299990000000...#204#-1399358784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:1>", "0.5", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-0.24999999999999997", "4.46", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"48", "<sample:7>", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=48, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"56", "<sample:7>", "Infinity"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=56, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:7>", "-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "4.4942328371557893E307", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "31", "<null>", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:6>", "-0.55"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "4.4942328371557893E307", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "31", "<null>", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:7>", "-1.1"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "4.4942328371557893E307", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "31", "<null>", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:7>", "4.300000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "4.4942328371557893E307", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "31", "<null>", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=4.300000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-0.5", "0.25", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "0.5", "-1.7976931348623157E308", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "0.5", "-1.7976931348623157E308", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "0.5", "-1.7976931348623157E308", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=0.5, getRelativeAccuracy=Infinity, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "5.0", "5.2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "-0.5", "-1.0", "8.988465674311579E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.25", "2.6", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-1, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "5.0", "5.2"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "-0.5", "-1.0", "8.988465674311579E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.25", "2.6", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-1, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "0", "<sample:1>", "1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=1.0, getMaxEvaluations=0, getMin=1.0, getRelativeAccuracy=Infinity, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "0", "<sample:1>", "1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=0, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "0", "<sample:1>", "1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=0, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "0", "<sample:1>", "1.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=0, getMin=1.0, getRelativeAccuracy=0.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<null>", "NaN", "0.0", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741771", "<sample:4>", "NaN", "-330.42", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-330.42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-330.42, getMaxEvaluations=1073741771, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"116", "<sample:2>", "-16.26"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "330.42", "330.42"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=116, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-16.26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"116", "<sample:6>", "-16.26"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.0", "330.42", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "330.42", "330.42"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"20", "<sample:3>", "-0.0", "-Infinity", "0.25", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:7>", "0.0", "-0.5", "-1.0", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "0.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-0.039", "-Infinity", "0.24999999999999997", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:7>", "0.0", "-0.5", "-1.0", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.039", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147483647, getMin=-0.039, getRelativeAccuracy=1.0E-14, getStartValue=0.24999999999999...#204#2144363596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-0.039", "-Infinity", "0.24999999999999997", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.039", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=2147483647, getMin=-0.039, getRelativeAccuracy=1.0, getStartValue=0.2499999999999...#205#1676466715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "31", "<sample:2>", "-1.0", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.375", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=31, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.375}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "31", "<sample:2>", "1.0", "0.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.25, getMaxEvaluations=31, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-2147483648", "<null>", "0.0", "330.42"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "330.42", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "1.92"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:7>", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:6>", "Infinity", "-0.5", "0.0", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.5, getMaxEvaluations=1, getMin=Infinity, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
