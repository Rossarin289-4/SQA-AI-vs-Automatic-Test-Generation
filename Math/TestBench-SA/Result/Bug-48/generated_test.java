package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.9999999999999999", "0.05", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:0>", "1.0", "1.0E-6", "0.0", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "0.9999999999999999", "0.0", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "-1.7976931348623155E308", "0.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:4>", "-1.0", "0.9999999999999999", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:7>", "-1.7976931348623155E307", "2.9300000000000006", "0.05"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:2>", "0.5", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:4>", "-1.0", "1.0", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<null>", "0.0", "-1.0", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:7>", "0.05", "2.9300000000000006", "0.049999999999999996"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:4>", "-1.0", "0.9999999999999999", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<null>", "-0.0", "-1.0", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"17", "<sample:8>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:1>", "NaN", "0.05", "Infinity", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9655861995802006E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=5, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=17, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"56", "<sample:4>", "-1.0", "1.0E-7", "7.300000000000001", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.9999999999999999", "-1.0E-7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.487211637440817E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-7, getMaxEvaluations=56, getMin=-1.0, getRelativeAccuracy=1.0, getStartValue=7.300000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"536870911", "<sample:6>", "-0.6250000000000001", "3.9999999999999996", "<sample:9>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.4501204058243435E-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=16, getFunctionValueAccuracy=1.0E-15, getMax=3.9999999999999996, getMaxEvaluations=536870911, getMin=-0.6250000000000001, getRelativeAccuracy=1.0E-14, ge...#219#1808258179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483539", "<sample:6>", "-3.1250000000000004", "18.714", "<sample:9>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.549410346186554E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=571, getFunctionValueAccuracy=1.0E-15, getMax=18.714, getMaxEvaluations=2147483539, getMin=-3.1250000000000004, getRelativeAccuracy=1.0E-14, getStartValue=7...#217#-446273320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-0.31250000000000006", "5.2485", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.506914324877439E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=20, getFunctionValueAccuracy=1.0E-15, getMax=5.2485, getMaxEvaluations=2147483647, getMin=-0.31250000000000006, getRelativeAccuracy=1.0E-14, getStartValue=2...#205#-259148740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483628", "<sample:12>", "-35.14", "8.093700000000004", "<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "-2.0E-7"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:2>", "1.0000000000000002E-6", "0.49999999999999994", "0.5", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.093700000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=8.093700000000004, getMaxEvaluations=2147483628, getMin=-35.14, getRelativeAccuracy=1.0E-14, getStartValue=-13...#217#10509837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483576", "<sample:12>", "-35.14", "8.093700000000004", "<sample:7>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:2>", "5.000000000000001E-7", "0.049999999999999996", "0.5", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5680363710357973E-12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1829, getFunctionValueAccuracy=1.0E-15, getMax=8.093700000000004, getMaxEvaluations=2147483576, getMin=-35.14, getRelativeAccuracy=1.0E-14, getStartValue=-1...#218#208849673", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"536870917", "<sample:4>", "-7.020799999999999", "1.0E-7", "<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:12>", "0.5", "2.5000000000000004E-7"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483542", "<sample:4>", "-0.067999", "0.09999999999999999", "20.0", "<sample:9>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483576", "<sample:12>", "-35.14", "2.930000000000001", "-0.6250000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.998842642744421E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=9, getFunctionValueAccuracy=Infinity, getMax=1.0E-7, getMaxEvaluations=536870917, getMin=-7.020799999999999, getRelativeAccuracy=0.0, getStartValue=-3.51039994...#208#-281518483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741793", "<sample:10>", "-25.09900000000001", "1.1814000000000007", "<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "17", "<sample:8>", "-1.0", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "5.2485", "7.300000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1814000000000007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.1814000000000007, getMaxEvaluations=1073741793, getMin=-25.09900000000001, getRelativeAccuracy=1.0, getStart...#226#539431540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.0", "-0.5", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "21", "<null>", "1.0E-6", "8.988465674311579E307", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0E-6", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0E-6", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:2>", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=-1.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"48.0", "-1.7976931348623157E308"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"0", "<sample:5>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "-1.0", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"0", "<sample:6>", "0.5", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "-0.5", "1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.9999999999999999", "0.005", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:0>", "1.0", "1.0E-6", "0.0", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "0.9999999999999999", "0.0", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"5", "<sample:1>", "0.5", "Infinity", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-9", "<sample:1>", "0.5", "Infinity", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-4.9"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.05", "NaN", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "9.8"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.05", "1.7976931348623157E308", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "-1.0", "-1.0", "-1.0", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.0E-6", "NaN", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-1.0", "0.05", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.05, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.475}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:5>", "1.0E-6", "Infinity", "-1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0", "Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.0", "Infinity"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "-0.04", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:7>", "0.05", "-1.0", "1.0", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=10, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.9999999999999999", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.05", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-10", "<sample:1>", "0.05", "1.0", "-1.7976931348623157E308", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-10", "<sample:0>", "0.05", "1.0", "-1.7976931348623157E308", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-10", "<sample:0>", "0.05", "1.0", "-1.7976931348623157E308", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-10", "<sample:0>", "0.05", "1.0", "-1.7976931348623157E308", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=0.0, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0, getRelativeAccuracy=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "1.0000000000000002", "0.9999999999999999", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=1, getMin=1.0000000000000002, getRelativeAccuracy=1.0E-14, getStartValue=N...#203#-953847743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:1>", "0.05", "-1.0", "0.5", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:2>", "0.05", "1.0E-6", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.05, getRelativeAccuracy=1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:1>", "0.05", "-1.0", "0.5", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:2>", "0.05", "1.0E-6", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:1>", "0.1", "-1.0", "0.5", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:2>", "0.05", "1.0E-6", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "4.0", "Infinity", "9.8"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "2.0", "0.9999999999999999", "0.05"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1073741824", "<sample:9>", "4.0", "Infinity", "9.8"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "2.0", "0.9999999999999999", "0.05"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1073741824", "<sample:4>", "-0.8", "Infinity", "9.8"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "20.0", "0.9999999999999999", "0.05"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=Infinity, getMaxEvaluations=1073741824, getMin=-0.8, getRelativeAccuracy=-1.0, getStartValue=9.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1073741824", "<sample:4>", "-0.8", "Infinity", "1.7976931348623157E308"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "20.0", "0.9999999999999999", "0.049999999999999996"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=Infinity, getMaxEvaluations=1073741824, getMin=-0.8, getRelativeAccuracy=-1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "0.0", "2.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=Infinity, getMax=2.1, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=1.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "0.0", "2.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.1, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=1.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "0.0", "0.21000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.21000000000000002, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.105000000000...#206#700115689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "0.0", "0.21000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.21000000000000002, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.1050000000...#208#-1614676452", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:5>", "Infinity", "Infinity", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=0, getMin=Infinity, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:2>", "NaN", "5.0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:1>", "-1.7976931348623157E308", "-1.0", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:3>", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:1>", "-1.7976931348623157E308", "-1.0", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:3>", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "NaN", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "0.9999999999999999", "54.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "0.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "Infinity", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "10.0", "54.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "0.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "Infinity", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.05", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:0>", "0.9999999999999999", "1.0E-6"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.05", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:0>", "0.9999999999999999", "1.0E-6"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-0.5", "-4.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-1.0", "NaN"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"51", "<sample:7>", "0.05", "2.9300000000000006", "0.049999999999999996"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:4>", "-1.0", "0.9999999999999999", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<null>", "-0.0", "-1.0", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=51, getMin=0.05, getRelativeAccuracy=-1.0, getStartValue=0.049999999999999996...#201#398346373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<null>", "1.0E-6", "1.7976931348623157E308", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "0.5", "0.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "0.0", "0.5", "-1.0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "-1.7976931348623157E308", "NaN", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:0>", "NaN", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:0>", "NaN", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:0>", "NaN", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2", "<sample:0>", "NaN", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-2, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2", "<sample:0>", "NaN", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=Infinity, getMaxEvaluations=-2, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:0>", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:0>", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:0>", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:0>", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:0>", "NaN", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:7>", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=-1.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<sample:2>", "NaN", "1.0E-6", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "1.0", "-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "0.9999999999999999", "-0.73"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "-1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:5>", "0.5", "0.5", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.5, getMaxEvaluations=-1, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:1>", "Infinity", "NaN", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-1", "<sample:6>", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"0", "<sample:1>", "0.5", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"9.999999999999997E-6", "-5.4"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:2>", "Infinity", "-1.7976931348623157E308", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=0, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "0.5", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.9999999999999999", "0.5", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "-1.7976931348623157E308", "0.0", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.9999999999999999", "0.5", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:0>", "1.0", "1.0E-6", "0.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "-1.7976931348623157E308", "0.0", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "-1.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.0", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-4.9"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.05", "NaN", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=-Infinity, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-4.9"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.05", "NaN", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=NaN, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=-1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-4.9"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.05", "NaN", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.0", "0.05", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.0", "0.05", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"33", "<sample:3>", "0.0", "5.0E-8", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:3>", "-1.0", "-1.0", "0.5", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.0E-6", "NaN", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741823", "<sample:3>", "-1.0", "-0.5", "0.5000000000000001", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.500001", "NaN", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1", "<null>", "Infinity", "1.7976931348623157E308", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:1>", "0.9999999999999999", "0.9999999999999999", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "0.9999999999999999", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<sample:3>", "-1.7976931348623157E308", "Infinity", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<sample:3>", "-Infinity", "Infinity", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<sample:3>", "-Infinity", "-Infinity", "0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=-1, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-1", "<sample:7>", "-Infinity", "-Infinity", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=-1, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"50", "<sample:7>", "-Infinity", "-Infinity", "-4.9E-324"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-Infinity, getMaxEvaluations=50, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "-1.1102230246251565E-16"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.7976931348623157E308", "-1.1102230246251565E-16"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<sample:3>", "Infinity", "Infinity", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:6>", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<null>", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.9999999999999999", "NaN", "0.9999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "1", "<sample:3>", "0.9999999999999999", "0.05"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=0.05, getMaxEvaluations=1, getMin=0.9999999999999999, getRelativeAccuracy=1.0, getStartValue=0.5249999999999...#204#628942792", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=0.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:1>", "0.0", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "0.9999999999999999"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.7000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "0.9999999999999999"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "NaN"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:0>", "0.9999999999999999", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=0.9999999999999999, getRelativeAccuracy=-1.0, getStartValue=-1...#203#1618210080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "NaN"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:0>", "-0.9999999999999999", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=-0.9999999999999999, getRelativeAccuracy=-1.0, getStartValue=-...#204#1754782677", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:0>", "-0.9999999999999999", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=-0.9999999999999999, getRelativeAccuracy=1.0E-14, getStartV...#210#662152016", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:4>", "1.0", "1.0E-6", "0.5", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=1.0E-6, getMaxEvaluations=0, getMin=1.0, getRelativeAccuracy=1.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "1.7976931348623157E308", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "0.0", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=Infinity, getMax=0.9999999999999999, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<null>", "NaN", "0.5", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"3", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=3, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:3>", "0.05", "0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<null>", "NaN", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=1, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<null>", "1.0", "1.0E-6", "NaN", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:7>", "0.5", "1.0E-6", "NaN", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:2>", "0.5", "0.05", "1.0E-6", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:2>", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#-707931928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.4500000000000006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.9999999999999999", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2139095039", "<sample:2>", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2139095039, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#-1295722875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.9999999999999999", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"5.000000000000004E-4"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.9999999999999999", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:2>", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "Infinity", "1.7976931348623157E308", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=10, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6...#201#-830485700", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:7>", "Infinity", "1.7976931348623157E308", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=10, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:4>", "-1.7976931348623157E308", "1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "0.9999999999999999", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.9999999999999999", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "0.05", "1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "0.05", "1.7976931348623157E308"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-1.7976931348623157E308", "1.0"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "0.0", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:1>", "-1.7976931348623157E308", "-1.7976931348623157E308", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:7>", "-1.7976931348623157E308", "-1.7976931348623157E308", "-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#215#-917327195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-0.05", "-4.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:2>", "-1.0", "0.5", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-4.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:2>", "-1.0", "0.5", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=10, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-4.000000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:2>", "-1.0", "0.5", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=10, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "1.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:7>", "1.0", "0.9999999999999999", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=10, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "1.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "0.5", "0.5", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308...#201#-2083925860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:2>", "1.0E-6", "1.0", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=0.5000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:2>", "1.0E-6", "1.0", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=0.5000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.039"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.0", "0.9999999999999999", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.0", "0.9999999999999999", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-1.0", "0.9999999999999999", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:4>", "-0.0", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=-1.7976931348623155E307, getMaxEvaluations=2147483647, getMin=-0.0, getRelativeAccuracy=-1.0, getStartValue=-8.98846567...#212#-1747792903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:4>", "-0.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=-0.0, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:5>", "0.049999999999999996"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.049999999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:2>", "-4.761999"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-4.761999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:1>", "-2.3809994999999997"}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:1>", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:0>", "1.0E-6", "0.0", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.126"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:5>", "-4.9E-324", "Infinity", "-Infinity", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "2.0E-6", "NaN", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=2.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "1.9999999999999995E-6", "NaN", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9999999999999995E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=1.9999999999999995E-6, getRelativeAccuracy=1.0, getStartValue=1.0E-6...#201#109281005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:7>", "1.9999999999999995E-6", "NaN", "1.0E-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9999999999999995E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=2147483647, getMin=1.9999999999999995E-6, getRelativeAccuracy=Infinity, getStartValue=1.0...#204#-1167694890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:5>", "1.7976931348623157E308", "-1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=-1, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getSt...#219#626622995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:5>", "0.5", "-1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623155E308, getMaxEvaluations=-1, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-8.9884656...#213#1350536249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.7976931348623157E308", "Infinity", "3.595386269724631E306"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-0.0", "3.2900000000000005", "0.49999999999999994"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.0", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"10", "<sample:4>", "NaN", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "NaN", "0.05", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"10", "<sample:4>", "NaN", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "NaN", "0.05", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"10", "<sample:3>", "NaN", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "NaN", "-0.65", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "1.0", "-4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "-1.7976931348623155E307"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=0.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "-0.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "2.9300000000000006", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-1, getMin=2.9300000000000006, getRelativeAccuracy=1.0E-14, getStartValue=1.4650000000000...#204#449187082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-64", "<sample:7>", "2.9300000000000006", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-64, getMin=2.9300000000000006, getRelativeAccuracy=1.0E-14, getStartValue=1.465000000000...#205#958235537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "64", "<sample:7>", "2.9300000000000006", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=64, getMin=2.9300000000000006, getRelativeAccuracy=1.0E-14, getStartValue=1.4650000000000...#204#332614543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.49999999999999994", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "64", "<sample:7>", "2.9300000000000006", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-1.7976931348623155E307", "-0.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=64, getMin=2.9300000000000006, getRelativeAccuracy=1.0E-14, getStartValue=1.4650000000000...#204#332614543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.0E-6", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:1>", "0.05", "0.05", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.05, getMaxEvaluations=-2147483648, getMin=0.05, getRelativeAccuracy=1.0E-14, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:6>", "1.0E-6", "-1.7976931348623156E306", "1.7976931348623157E308", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.0E-6", "0.9999999999999999", "0.9999999999999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:1>", "NaN", "0.05", "Infinity", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"17", "<sample:9>", "-1.0E-7", "2.9300000000000006", "1.7976931348623157E308", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:1>", "NaN", "0.05", "Infinity", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"17", "<sample:8>", "-1.0E-7", "2.9300000000000006", "1.7976931348623157E308", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:1>", "NaN", "0.05", "Infinity", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=2.9300000000000006, getMaxEvaluations=17, getMin=-1.0E-7, getRelativeAccuracy=1.0, getStartValue=1.797693134...#212#1756970168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"17", "<sample:8>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:1>", "NaN", "0.05", "Infinity", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=2.9300000000000006, getMaxEvaluations=17, getMin=-1.0E-7, getRelativeAccuracy=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9655861995802006E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=5, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=Inf...#206#2019337020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-1.0E-7", "5.860000000000001", "Infinity", "<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=5.860000000000001, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=Infi...#205#-1339250853", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "Infinity", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=In...#207#-1060416492", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:8>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:7>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.3481509610710651E-33", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=6, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=...#209#-1069291419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483647", "<sample:4>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:3>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-1.0E-7", "2.9300000000000006", "Infinity", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:3>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.9300000000000006, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=Inf...#206#1163929311", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "-1.0E-7", "29.300000000000004", "Infinity", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:3>", "1.0000000000000002E-6", "1.7976931348623157E308", "-1.7976931348623155E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.999378747325288E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2157, getFunctionValueAccuracy=1.0E-15, getMax=29.300000000000004, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=...#209#-552952594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "-1.0E-7", "29.300000000000004", "Infinity", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.4526065768876336E-27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2158, getFunctionValueAccuracy=1.0E-15, getMax=29.300000000000004, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=In...#207#-507398248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "-1.0E-7", "29.300000000000004", "Infinity", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("29.300000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=29.300000000000004, getMaxEvaluations=2147483647, getMin=-1.0E-7, getRelativeAccuracy=1.0E-14, getStartValue=Infin...#204#-1369837625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:1>", "0.9999999999999999", "0.5", "-1.7976931348623155E307", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.05", "-1.0E-7", "0.1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "17", "<sample:4>", "NaN", "1.7976931348623157E308", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=1.7976931348623157E308, getMaxEvaluations=17, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "1.0", "1.0000000000000002E-6", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002E-6, getMaxEvaluations=10, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:1>", "1.0", "1.0000000000000002E-6", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0000000000000002E-6, getMaxEvaluations=10, getMin=1.0, getRelativeAccuracy=0.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-28", "<sample:0>", "0.9999999999999999", "-0.0", "0.5"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "2.9300000000000006", "-0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.0, getMaxEvaluations=-28, getMin=0.9999999999999999, getRelativeAccuracy=-Infinity, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-28", "<sample:0>", "1.9999999999999998", "-0.0", "0.5"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "2.9300000000000006", "-0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.0, getMaxEvaluations=-28, getMin=1.9999999999999998, getRelativeAccuracy=-Infinity, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-28", "<sample:0>", "2.9300000000000006", "-0.0", "0.5"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "2.9300000000000006", "-0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-0.0, getMaxEvaluations=-28, getMin=2.9300000000000006, getRelativeAccuracy=-Infinity, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<null>", "1.7976931348623157E308", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "-1.0", "-1.0E-7", "-1.7976931348623155E307", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:0>", "Infinity", "10.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "-1.0", "-1.0E-7", "-1.7976931348623155E307", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:0>", "Infinity", "2.9300000000000006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "-1.0", "-1.7976931348623157E308", "-1.7976931348623155E307", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"30", "<sample:7>", "Infinity", "0.49999999999999994", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.49999999999999994, getMaxEvaluations=30, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"15", "<sample:7>", "Infinity", "-0.49999999999999994", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "-0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.49999999999999994, getMaxEvaluations=15, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"30", "<sample:7>", "Infinity", "-0.49999999999999994", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "-0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.49999999999999994, getMaxEvaluations=30, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"30", "<sample:10>", "Infinity", "-0.9999999999999999", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.05", "-0.0", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.5", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-0.9999999999999999, getMaxEvaluations=30, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<null>", "-1.7976931348623155E307", "0.05", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartV...#228#2041349860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartValu...#225#157711889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0, getStartVal...#226#1716650082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=4, getFunctionValueAccuracy=-1.0, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=Infinity, getStart...#229#667131541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.7976931348623155E308", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartV...#228#2041349860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getStartVal...#226#41019001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=0.0, getStartValue=-8...#221#710367580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=-Infinity, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0, getStartV...#228#1898174668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "38", "<sample:6>", "-1.7976931348623155E308", "0.9999999999999999", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.0", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=0.9999999999999999, getMaxEvaluations=38, getMin=-1.7976931348623155E308, getRelativeAccuracy=1.0E-14, getSta...#231#-584436626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"0", "<sample:2>", "Infinity", "2.9300000000000006", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "10", "<sample:5>", "2.9300000000000006", "1.0E-6"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"51", "<sample:2>", "0.0", "-2.8720000000000008", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-2.8720000000000008, getMaxEvaluations=51, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"524237", "<sample:2>", "0.0", "-2.8720000000000008", "NaN"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-2.8720000000000008, getMaxEvaluations=524237, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
}
