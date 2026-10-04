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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.7999999999999998"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "NaN", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-25.948999999999998", "Infinity", "-17.48", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:5>", "0.005", "84.0", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-17.48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=Infinity, getMaxEvaluations=2147483647, getMaximalOrder=8, getMin=-25.948999999999998, getRelativeAccuracy=1...#225#183923794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-0.24", "2", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483641", "<sample:11>", "-5.600000000000001", "1.7976931348623158E307", "4.19", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8800000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.0, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-0.24, getRelativeAccuracy=1.0E-14, getStartValue=0...#218#608249738", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:16>", "1.7976931348623157E308", "NaN", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=6, getMaximalOrder=6, getMin=1.7976931348623157E308, getRelativeAccuracy=0.0, getStartValue=...#204#1931552530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1074790399", "<sample:11>", "5.0E-7", "-5.590000000000001", "-0.42"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:16>", "7.800000000000001", "Infinity", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-5.590000000000001, getMaxEvaluations=1074790399, getMaximalOrder=2, getMin=5.0E-7, getRelativeAccuracy=1.0, g...#219#1735960403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"4.996999999999999", "0.7999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "0.0625", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "NaN", "0.4799999999999999", "-16.5"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"3.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "48", "<sample:11>", "0.009999999999999998", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=48, getMaximalOrder=2147483647, getMin=0.009999999999999998, getRelativeAccuracy=0.0, getSta...#212#576328340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "67108860", "<sample:6>", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1547005383792517", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=67108860, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infin...#204#-837701513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:0>", "-2.41", "1.0", "0.090001", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:1>", "NaN", "1.7976931348623157E308", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "3", "<sample:3>", "-0.54", "5.000000000000001", "2.5E-7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=5.000000000000001, getMaxEvaluations=3, getMaximalOrder=8, getMin=-0.54, getRelativeAccuracy=1.0, getStartVa...#211#-802273328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.56", "2.5"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-5", "<sample:1>", "1.7976931348623158E307", "Infinity", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-5, getMaximalOrder=5, getMin=1.7976931348623158E307, getRelativeAccuracy=1.0E-14, g...#222#1734902101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"131073", "<sample:11>", "-0.005", "0.005000000000000001", "<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.0E-6", "1.7976931348623157E308", "5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "0.3125", "0.7999999999999997"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "1", "<sample:4>", "-2.5E-7", "4.999999999999999E-7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=4.999999999999999E-7, getMaxEvaluations=1, getMaximalOrder=2147483647, getMin=-2.5E-7, getRelativeAccuracy=0.0, get...#233#428170770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:11>", "0.004999999999999999", "0.7999999999999998", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-48", "<sample:2>", "10.57", "-0.48"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "0.04999999999999999", "-0.96", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-30", "<sample:6>", "-10.000000000000002", "1.9999999999999998", "0.14"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "2.5000000000000004E-7"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"9.69"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"8", "<null>", "-5.0", "0.004999999999999999", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "-0.005", "-1.7976931348623158E307", "4.9625"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "10", "<sample:11>", "0.535", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=10, getMaximalOrder=5, getMin=0.535, getRelativeAccuracy=1.0E-14, getStartValue=0.7675000...#210#-2039931900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0000000000000002", "2.605", "0.004999999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-2147483648", "<sample:10>", "0.0024999999999999996", "-4.5"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:5>", "0.030000000000000002", "0.06250000000000003", "Infinity", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.06250000000000003, getMaxEvaluations=-2147483648, getMaximalOrder=5, getMin=0.030000000000000002, getRelativeA...#240#-131144266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.004999999999999999", "-0.04800000000000001", "4.0"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "511", "<sample:11>", "0.1135", "1.0E-6", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-0.3999999999999999", "5"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.4", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"3", "<sample:0>", "0.0", "0.5000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "-1.7976931348623157E308", "-0.48"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-6", "<sample:11>", "0.5000000000000001", "-2.8", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-2.8, getMaxEvaluations=-6, getMaximalOrder=5, getMin=0.5000000000000001, getRelativeAccuracy=1.0E-14, getStartV...#211#-972314595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:0>", "-0.0", "-19.5", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1073741807", "<sample:4>", "-0.48", "-63.480000000000004", "-1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:14>", "NaN", "-Infinity", "0.05", "<sample:0>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0025"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:2>", "-4.8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=2, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-4.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:9>", "-1.0E-323", "1.7976931348623157E308", "0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:12>", "-0.48000000000000004", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"4", "<sample:6>", "-0.0", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:1>", "-0.004999999999999999", "1.3999999999999995"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:6>", "10.000000000000002", "NaN", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=10.000000000000002, getRelativeAccuracy=1.0E-14, ge...#221#-367877833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-0.0", "0.004", "5"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"1073741824", "<sample:2>", "NaN", "0.8089999999999997"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.8089999999999997, getMaxEvaluations=1073741824, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, ge...#216#-289702588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-1.2999990000000001", "0.07999999999999999"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "3.9999999999999996", "NaN", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0024999999999999996"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "524268", "<sample:4>", "-8.988465674311579E307", "NaN", "NaN", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000031250146486", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=524268, getMaximalOrder=6, getMin=-8.988465674311579E307, getRelativeAccuracy=0.0, getStartV...#209#-1700173824", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483626", "<sample:11>", "Infinity", "Infinity", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.01", "4.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "0.004999999999999999", "-0.6499999999999998", "0.004999999999999999"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:9>", "-2.0000000000000004", "NaN", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "Infinity", "-0.00699975"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2147467263", "<sample:4>", "2.5", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=8.988465674311579E307, getMaxEvaluations=2147467263, getMaximalOrder=2147483647, getMin=2.5, getRelativeAccuracy=0....#240#1277929868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"3", "<null>", "-0.83", "0.0625", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "-3", "<sample:4>", "1.7976931348623158E307", "1.79"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:10>", "0.7999999999999998", "-1.0000000000000002", "5.4625", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "-0.009999999999999997", "0.005000000000000001", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.03", "1.7976931348623157E308", "0.0"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-60", "<sample:4>", "0.0", "-2.0000000000000004", "<sample:6>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-32", "<sample:1>", "-0.4800000000000001", "0.009999999999999998", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"5", "<sample:11>", "0.5", "-0.48", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "1.0", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0", "58.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.0E-6", "-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:3>", "NaN", "-4.9E-324", "0.005", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"5", "<sample:9>", "2.0000000000000004", "0.0625"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-4091", "<sample:11>", "-0.85", "2.0000000000000004", "0.9299999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000004, getMaxEvaluations=-4091, getMaximalOrder=5, getMin=-0.85, getRelativeAccuracy=1.0E-14, getSt...#228#-844835715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "1.7976931348623157E308", "54.5", "-0.149", "<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483605", "<sample:0>", "2.5E-7", "0.004999999999999999"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-2147483648", "<sample:8>", "0.05", "4.720000000000001", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=4.720000000000001, getMaxEvaluations=-2147483648, getMaximalOrder=5, getMin=0.05, getRelativeAccuracy=1.0E-14, g...#223#957939191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-6", "<sample:11>", "-9.999999999999999E-6", "23.0", "NaN", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=23.0, getMaxEvaluations=-6, getMaximalOrder=4, getMin=-9.999999999999999E-6, getRelativeAccuracy=1.0E-14, getStart...#210#-1529883308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "-49", "<sample:1>", "4.9E-324", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"5", "<null>", "10.0", "5.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-2147483648", "<sample:2>", "-0.05299975", "-9.999999999999997E-7"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "-4.999999999999999"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-2147418081", "<sample:7>", "2.0E-6", "54.625", "0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=54.625, getMaxEvaluations=-2147418081, getMaximalOrder=5, getMin=2.0E-6, getRelativeAccuracy=1.0E-14, getStartVa...#224#-1265087690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-10", "<sample:10>", "0.8209999999999997", "NaN", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-0.004999999999999998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:0>", "0.427", "1.4000000000000001", "-0.475", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.4000000000000001, getMaxEvaluations=3, getMaximalOrder=5, getMin=0.427, getRelativeAccuracy=1.0E-14, getStartV...#212#-1597424856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.004999999999999999", "0.7999999999999999", "1.5999999999999996"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147481600", "<sample:4>", "1.7976931348623155E308", "0.005", "Infinity", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.005, getMaxEvaluations=-2147481600, getMaximalOrder=6, getMin=1.7976931348623155E308, getRelativeAccuracy=0.0, ge...#221#-1483912661", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "2.7", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"8", "<sample:8>", "-1.7976931348623157E308", "-0.004999999999999999", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "1.0", "0.04999999999999999", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.5099999999999998", "-9.999999999999999E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:0>", "0.0", "Infinity", "10.000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2147483647", "<sample:5>", "0.5", "-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-2147483648, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartVal...#222#396495722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:3>", "NaN", "0.5", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1879048149", "<sample:2>", "-0.005", "0.5", "-0.24"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=1879048149, getMaximalOrder=5, getMin=-0.005, getRelativeAccuracy=1.0E-14, getStartValue=...#206#-1033063124", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<null>", "-1.7976931348623155E308", "1.028", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:11>", "-8.988465674311578E307", "NaN", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=3, getMaximalOrder=4, getMin=-8.988465674311578E307, getRelativeAccuracy=Infinity, getSta...#212#-1051052711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:5>", "-0.4799999999999999", "5.389999999999999", "0.1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "-8.988465674311579E307", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "Infinity", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:6>", "-1.7976931348623155E308", "-0.1", "NaN"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623155E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2147483645", "<sample:6>", "1.7976931348623157E308", "4.0", "-0.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "10", "<sample:2>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=4.0, getMaxEvaluations=2147483645, getMaximalOrder=2, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0, ...#219#1501720699", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "4", "<sample:2>", "1.0000000000000002E-6", "7.999999999999997", "0.031249999999999997"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "0.32", "NaN", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=0.32, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#1993450531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"49", "<sample:8>", "-0.064", "NaN", "2.5000000000000004E-7"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "0.05", "-0.4799999999999999", "0.0025"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-8", "<null>", "0.4", "1.7976931348623157E308", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"4", "<null>", "0.005", "Infinity", "-8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:4>", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.105", "-0.7999999999999998"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "4.9E-324", "0.067"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1073741822", "<sample:4>", "5.000000000000001", "-26.4975", "1.0000000000000002E-6", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-26.4975, getMaxEvaluations=1073741822, getMaximalOrder=5, getMin=5.000000000000001, getRelativeAccuracy=1.0E-14...#238#-376818851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.7999999999999998", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:0>", "-1.7976931348623157E308", "0.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-1...#221#-215350362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "-1073741824", "<sample:3>", "2", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-1073741824, getMaximalOrder=5, getMin=2.0, getRelativeAccuracy=1.0E-14, getStartValue=1....#202#899617162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:5>", "0.135", "1.7976931348623157E308", "2", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483595", "<null>", "0.0", "-0.0", "8.988465674311579E307", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:2>", "-0.009", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0045", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=4.9E-324, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-0.009, getRelativeAccuracy=1.0E-14, getStartV...#213#2118567594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483626", "<sample:6>", "1.0E-6", "0.11", "1.5059999999999996", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.11, getMaxEvaluations=2147483626, getMaximalOrder=8, getMin=1.0E-6, getRelativeAccuracy=1.0, getStartValue...#220#1555125359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-2147483647", "<null>", "-4.9E-324", "0.0024999999999999996", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"1", "<sample:7>", "-0.5700000000000001", "2.3699999999999997"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8999999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.3699999999999997, getMaxEvaluations=1, getMaximalOrder=5, getMin=-0.5700000000000001, getRelativeAccuracy=1.0E...#238#-1422631511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-2147483648", "<sample:7>", "4.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:11>", "-0.0445", "0.48", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.48, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-0.0445, getRelativeAccuracy=1.0E-14, getStartValu...#210#98489224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "7.999999999999999", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-2147483648", "<sample:3>", "0.9999999999999999", "-0.7999999999999998", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-1", "<sample:3>", "-3.2", "0.06249999999999999", "2.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.06249999999999999, getMaxEvaluations=-1, getMaximalOrder=5, getMin=-3.2, getRelativeAccuracy=1.0E-14, getStart...#210#-1088025109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.075", "0.7999999999999998"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483645", "<sample:11>", "5.000000000000001", "0.40000000000000013", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7000000000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.40000000000000013, getMaxEvaluations=2147483645, getMaximalOrder=5, getMin=5.000000000000001, getRelativeAccur...#246#-228908872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "4.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "0.7999999999999997"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483645", "<sample:7>", "-1.0E-323", "0.009999999999999998", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.004999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.009999999999999998, getMaxEvaluations=2147483645, getMaximalOrder=5, getMin=-1.0E-323, getRelativeAccuracy=1.0...#241#-1412344174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "0.39999999999999986", "1.25", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483545", "<sample:0>", "-43.0", "0.05", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.05, getMaxEvaluations=2147483545, getMaximalOrder=2, getMin=-43.0, getRelativeAccuracy=1.0, getStartValue=5....#202#1834805367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:11>", "0.125"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"90", "<sample:2>", "-1.7976931348623157E308", "-0.046"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-0.046, getMaxEvaluations=90, getMaximalOrder=5, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ge...#235#-1343996122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "536870912", "<sample:0>", "5.99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=536870912, getMaximalOrder=6, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=5.99}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:1>", "0.0", "-5.85"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:3>", "0.01", "0.01", "Infinity", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.4999999999999994E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:5>", "2.0", "1.0", "1.0000000000000002", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=3, getMaximalOrder=5, getMin=2.0, getRelativeAccuracy=1.0E-14, getStartValue=1.0000000000...#207#-68824197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "8.988465674311579E306"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"2.0E-6", "1.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:2>", "-0.031", "6.4", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1845", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=6.4, getMaxEvaluations=2, getMaximalOrder=6, getMin=-0.031, getRelativeAccuracy=0.0, getStartValue=3.1845}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "5", "<sample:11>", "0.25", "5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=5, getMaximalOrder=2, getMin=0.25, getRelativeAccuracy=1.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-1.79999975", "0.625", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.587499875", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.625, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-1.79999975, getRelativeAccuracy=1.0E-14, getStar...#220#-1735082860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "0.08"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "-67108854", "<sample:0>", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-67108854, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14...#238#-89907773", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "NaN", "NaN", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN...#201#1324681231", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.29999999999999993", "-0.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:8>", "0.009999999999999998", "0.005", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "Infinity", "0.019999999999999997"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-71", "<sample:5>", "NaN", "-Infinity", "1.25E-7", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=-Infinity, getMaxEvaluations=-71, getMaximalOrder=8, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.25...#204#-246468308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "1.7976931348623157E308", "1.0", "NaN", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-536870908", "<sample:0>", "2.5E-7", "0.5", "0.06250000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14...#220#152987354", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483644", "<sample:5>", "0.0", "0.3999999999999999", "Infinity", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "0.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"76", "<sample:2>", "0.5", "5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=76, getMaximalOrder=5, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=2.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.4", "5.4"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:5>", "0.0625", "0.004999999999999999", "1.25E-7", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"0", "<sample:5>", "0.06250000000000001", "-0.06250000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:14>", "Infinity", "Infinity", "-0.0", "<null>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "-1.0", "0.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-2147483648", "<sample:5>", "-5.0", "NaN"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"3", "<sample:6>", "-46.0", "-0.7999999999999998", "0.0", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "-0.9419999999999998", "-0.7999999999999998"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"27", "<sample:2>", "-8.988465674311579E307", "-0.5", "<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557893E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-0.5, getMaxEvaluations=27, getMaximalOrder=2, getMin=-8.988465674311579E307, getRelativeAccuracy=1.0, getStar...#231#1749521745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<null>", "5.0E-7", "0.005", "-4.0", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.5"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2147483605", "<sample:13>", "Infinity", "-1.0E-323"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=-1.0E-323, getMaxEvaluations=2147483605, getMaximalOrder=6, getMin=Infinity, getRelativeAccuracy=0.0, getStartValue...#205#1954123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-0.0024999999999999996", "2.9000000000000004", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4487500000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.9000000000000004, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-0.0024999999999999996, getRelativeA...#250#-1063528497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"0", "<sample:4>", "-29.995", "1.0E-7"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.03125", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.12500000000000003", "20.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-4.9E-324", "0.08", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-2147483648", "<sample:9>", "2.5E-7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-2147483648, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2....#205#-984276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.7999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "6", "<sample:2>", "8.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=6, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=8.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "1.0E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.00625", "0.7999999999999998", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.5E-323", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "-0.06250000000000003", "0.12500000000000003"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.06250000000000001"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:0>", "-55.0", "2.7500005", "0.004999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=2.7500005, getMaxEvaluations=2147483647, getMaximalOrder=6, getMin=-55.0, getRelativeAccuracy=0.0, getStartValue=0....#219#-539857129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483647", "<sample:2>", "0.05800025", "1.7976931348623155E308", "1.0", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "2.5E-7", "2.0000000000000003E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-3", "<sample:1>", "2.40000025", "0.0625", "1.25E-7", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=-3, getMaximalOrder=5, getMin=2.40000025, getRelativeAccuracy=1.0E-14, getStartValue=1...#207#139955750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "6", "<sample:0>", "-0.0", "-1.0E-323", "-1.0000000000000002"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0E-323, getMaxEvaluations=6, getMaximalOrder=5, getMin=-0.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.00...#215#-817706868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483647", "<sample:6>", "0.009999999999999998"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "10.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.48000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483645", "<sample:3>", "1.0", "-2.0", "44.0625", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-2.0, getMaxEvaluations=2147483645, getMaximalOrder=5, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=44...#206#-2011408725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-0.48", "-4.9E-324"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "NaN", "-0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=-4.9E-324, getMaxEvaluations=2147483647, getMaximalOrder=4, getMin=-0.48, getRelativeAccuracy=Infinity, getStart...#212#655967733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-Infinity", "0.25000000000000006", "<sample:5>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:11>", "NaN", "0.03125000000000001", "-0.8", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483647", "<sample:4>", "-0.34", "-1.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-2147483647, getMaximalOrder=5, getMin=-0.34, getRelativeAccuracy=1.0E-14, getStartValue...#221#-713687959", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:2>", "-0.0010000000000000009", "0.03125", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-2147483647", "<sample:7>", "5.0E-7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.015125", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.03125, getMaxEvaluations=2147483647, getMaximalOrder=8, getMin=-0.0010000000000000009, getRelativeAccuracy...#229#788306257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "-43.0", "-4.9E-324"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "0.06250000000000001", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483605", "<sample:13>", "-1.0E-323"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483605, getMaximalOrder=6, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-1.0E-323}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "0", "<sample:5>", "2.5E-7"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.005", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=0, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.5E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-20", "<sample:4>", "-1.0", "0.009999999999999998", "0.005"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "536870908", "<sample:3>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.009999999999999998, getMaxEvaluations=-20, getMaximalOrder=4, getMin=-1.0, getRelativeAccuracy=Infinity, getSt...#215#-505468734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"-124", "<sample:3>", "4.9E-324"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"15", "<sample:4>", "-8.995", "1.7976931348623157E308", "0.7999999999999998", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-16", "<sample:4>", "-4.9E-323", "NaN", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=-16, getMaximalOrder=8, getMin=-4.9E-323, getRelativeAccuracy=1.0, getStartValue=-0.9...#216#-1892244106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-1.01", "1.0000000000000002"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.004999999999999893", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-1.01, getRelativeAccuracy=1.0E-14, ...#236#-151515525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.0", "-0.48000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"106", "<sample:11>", "NaN", "0.16000025", "0.01"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "20", "<sample:11>", "-1.7976931348623157E308", "Infinity", "4.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:11>", "59.0", "-90.0", "0.005000000000000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-90.0, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=59.0, getRelativeAccuracy=1.0E-14, getStartValue=...#221#-2117822125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"9.999999999999997E-7", "0.0", "0.005"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2", "<sample:4>", "4.0", "7.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=7.0, getMaxEvaluations=2, getMaximalOrder=5, getMin=4.0, getRelativeAccuracy=1.0E-14, getStartValue=5.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<null>", "-7.237500000000001", "-3.595", "-0.056", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "16777215", "<sample:8>", "-Infinity", "-Infinity", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:10>", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=2147483647, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=0...#203#1992904136", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"16", "<null>", "40.00000000000001", "-0.004", "0.005000000000000001", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-0.0", "NaN", "0.7999999999999998"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483605", "<sample:6>", "-1.7976931348623157E308", "62.0", "8.988465674311579E307", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=62.0, getMaxEvaluations=-2147483605, getMaximalOrder=6, getMin=-1.7976931348623157E308, getRelativeAccuracy=0.0, ge...#234#-434043144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "-0.48", "Infinity", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMaximalOrder=2, getMin=-0.48, getRelativeAccuracy=1.0, getStartValu...#211#1155396990", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "0.04999999999999999", "1.9999999999999998"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"5", "<null>", "1.0000000000000002", "-Infinity", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-29", "<sample:1>", "0.004999999999999999"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-536870908", "<sample:1>", "-Infinity", "5.443", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=5.443, getMaxEvaluations=-536870908, getMaximalOrder=8, getMin=-Infinity, getRelativeAccuracy=1.0, getStartV...#209#-582499656", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.3699999999999999", "-6.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "5.8100000000000005", "2.4999999999999994E-7", "2.0000000000000004", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=2.4999999999999994E-7, getMaxEvaluations=2147483647, getMaximalOrder=6, getMin=5.8100000000000005, getRelativeAccur...#242#-306841878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:2>", "-8.988465674311579E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=8, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-8....#220#929391468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-2147483648", "<sample:4>", "-0.48"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-2147483648, getMaximalOrder=6, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-0.48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2143289301", "<sample:7>", "NaN", "2.0", "-1.053"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.053", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.0, getMaxEvaluations=2143289301, getMaximalOrder=6, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-1.053}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.045", "0.0625"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-3", "<sample:1>", "0.8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-3, getMaximalOrder=4, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "0.7999999999999998", "2.4999999999999994E-7", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.4999999999999994E-7, getMaxEvaluations=2147483647, getMaximalOrder=2147483647, getMin=0.7999999999999998, getRela...#252#-955903974", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-262149", "<sample:6>", "-1.7976931348623157E308", "-2.7", "-Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-2.7, getMaxEvaluations=-262149, getMaximalOrder=5, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14,...#225#-1773574622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "536870908", "<sample:2>", "-1.0E-323", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870908", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=Infinity, getMaxEvaluations=536870908, getMaximalOrder=4, getMin=-1.0E-323, getRelativeAccuracy=Infinity, getSta...#217#-533140509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483607", "<sample:7>", "-0.065", "2.0000000000000003E-6", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.032499", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=2.0000000000000003E-6, getMaxEvaluations=2147483607, getMaximalOrder=5, getMin=-0.065, getRelativeAccuracy=1.0E-...#228#136513137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"268435466", "<sample:7>", "-1.0", "1.0", "-1.0E-323", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2147483605", "<sample:3>", "41.0", "-5.000000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=268435466, getMaximalOrder=2, getMin=-1.0, getRelativeAccuracy=1.0, getStartValue=-1.0E...#205#-1995227006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.010999"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "1", "<sample:9>", "0.005", "-4.9E-324", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.9E-324, getMaxEvaluations=1, getMaximalOrder=6, getMin=0.005, getRelativeAccuracy=0.0, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-8.0", "0.0", "Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "4.9E-324", "Infinity", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "Infinity", "0.009999999999999998", "4.0", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.009999999999999998, getMaxEvaluations=2147483647, getMaximalOrder=2, getMin=Infinity, getRelativeAccuracy=1....#221#391320117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"4.5", "-0.11749999999999998"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:3>", "1.0E-6", "3.4625000000000004", "-2.995", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-1073741835", "<sample:2>", "-0.24", "0.7999999999999998", "5.0E-7"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:0>", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2", "<sample:15>", "-3.1", "0.009999999999999998", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2147483647", "<sample:2>", "-0.005", "0.006250000000000001", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.006250000000000001, getMaxEvaluations=2147483647, getMaximalOrder=2, getMin=-0.005, getRelativeAccuracy=1.0,...#219#447330837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "4.000000000000001", "2", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "1.25E-7"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:2>", "1.5999999999999996", "-0.0", "1.0", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=-0.0, getMaxEvaluations=-2147483648, getMaximalOrder=4, getMin=1.5999999999999996, getRelativeAccuracy=Infinity,...#219#1176873477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "20", "<sample:4>", "0.10650000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=20, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.106500000...#209#-809560663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "NaN", "-1.08"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "5", "<sample:1>", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=5, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483647", "<sample:3>", "5", "0.12500000000000006", "-1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "NaN", "0.012"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.12500000000000006, getMaxEvaluations=-2147483647, getMaximalOrder=2, getMin=5.0, getRelativeAccuracy=1.0, ge...#217#-998918290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483633", "<sample:2>", "-0.009999000000000001"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.009999000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=2147483633, getMaximalOrder=8, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-0....#219#-1055080336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-45", "<sample:8>", "0.625"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=-45, getMaximalOrder=4, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=0.625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.019999999999999997", "0.1725"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483645", "<sample:2>", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483645, getMaximalOrder=6, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-65570", "<sample:5>", "-0.6049990000000001", "0.005"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
}
