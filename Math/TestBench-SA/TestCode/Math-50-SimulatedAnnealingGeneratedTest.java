package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:6>", "1.0E-6", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "1.7976931348623157E308", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0, getStartValue=...#209#270402312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:4>", "-1.0", "1.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-1.0", "1.0E-6", "1.7976931348623157E308", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "NaN", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1403181052411018E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157...#205#2004869165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-1.0", "1.0E-6", "1.7976931348623157E308", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "NaN", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1403181052411018E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157...#205#2004869165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147481599", "<sample:6>", "-0.61", "3.999999", "1.7976931348623157E308", "<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "-4.4942328371557893E307", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.2446373103147237E-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=16, getFunctionValueAccuracy=1.0E-15, getMax=3.999999, getMaxEvaluations=2147481599, getMin=-0.61, getRelativeAccuracy=1.0E-14, getStartValue=1.797693134...#212#761403998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1125", "<sample:10>", "-0.61", "1.3324500000000004", "2.3775"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "20", "<sample:4>", "-0.28125", "0.32900200000000007", "0.0", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "1", "<null>", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3225643766457702", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=-Infinity, getMax=1.3324500000000004, getMaxEvaluations=1125, getMin=-0.61, getRelativeAccuracy=1.0, getStartValue=2.3775}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"10", "<sample:3>", "5.0", "Infinity"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:8>", "-2.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.28125", "0.5", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"68", "<sample:3>", "5.000000000000002", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:8>", "-2.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.28125", "0.5", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"68", "<sample:7>", "-30.000002", "Infinity"}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:8>", "-2.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.28125", "0.5", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:5>", "1.7976931348623157E308", "1.7976931348623157E308", "2.3775"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-30.000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=68, getMin=-30.000002, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"5", "<sample:6>", "20.040000000000003", "-Infinity"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.28125", "0.5", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:5>", "1.7976931348623157E308", "-1.7976931348623157E308", "1.18875"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=-Infinity, getMaxEvaluations=5, getMin=20.040000000000003, getRelativeAccuracy=-1.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2", "<sample:10>", "20.040000000000003", "-Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:6>", "-0.28125", "0.5", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:5>", "1.7976931348623157E308", "-Infinity", "1.18875"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=-Infinity, getMaxEvaluations=2, getMin=20.040000000000003, getRelativeAccuracy=Infinity, getStartValue=-Infinity...#201#958945236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741823", "<sample:8>", "-16.300000000000004", "1.645999999999999", "-0.07599999999999998", "<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.016459999999999995", "-0.28125", "-2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.687051914486297E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=276, getFunctionValueAccuracy=1.0E-15, getMax=1.645999999999999, getMaxEvaluations=1073741823, getMin=-16.300000000000004, getRelativeAccuracy=1.0E-14, getS...#231#-44843772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:12>", "-0.27324999999999994", "9.649999999999988", "48.999999", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.7541469561830566E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=109, getFunctionValueAccuracy=1.0E-15, getMax=9.649999999999988, getMaxEvaluations=2147483647, getMin=-0.27324999999999994, getRelativeAccuracy=1.0E-14, get...#221#-432264214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:12>", "-0.27324999999999994", "9.659999999999988", "48.999999", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.386106523338351E-13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=112, getFunctionValueAccuracy=1.0E-15, getMax=9.659999999999988, getMaxEvaluations=2147483647, getMin=-0.27324999999999994, getRelativeAccuracy=1.0E-14, get...#221#-490156575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-27.093"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "-4.4942328371557893E307", "-10.000000000000002", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "20", "<sample:8>", "-1.6300000000000003", "2.3775", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.3755933995079594E-159", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=11, getFunctionValueAccuracy=1.0E-15, getMax=2.3775, getMaxEvaluations=20, getMin=-1.6300000000000003, getRelativeAccuracy=1.0E-14, getStartValue=0.37374999...#209#1870488110", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:7>", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:3>", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:7>", "1.0", "-1.7976931348623157E308", "Infinity", "<sample:7>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "0.5", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<null>", "1.0", "1.7976931348623157E308", "-1.7976931348623157E308", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "0.5", "1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<null>", "1.0", "1.7976931348623157E308", "-1.7976931348623157E308", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:7>", "0.5", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "Infinity", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-...#222#2138250156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:7>", "0.5", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValu...#225#133970102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<sample:1>", "1.0", "-1.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:7>", "1.0E-6", "0.0", "1.0", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.6119996000000001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<null>", "Infinity", "NaN", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:5>", "0.0", "1.0", "1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "0.1"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<null>", "1.0", "-4.4942328371557893E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.10000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.10000000000000002"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "-0.10000000000000002"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623153E307", "Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "-56.0", "-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"7.69", "-Infinity"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:3>", "-4.4942328371557893E307", "Infinity", "1.0", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:1>", "-4.4942328371557893E307", "Infinity", "20.0", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-10", "<sample:4>", "Infinity", "0.0", "-0.1"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<null>", "0.0", "-1.7976931348623157E308", "0.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "Infinity", "0.0", "-0.1"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<null>", "0.0", "-1.7976931348623157E308", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=0.0, getStartValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "Infinity", "0.0", "-0.01"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<null>", "0.0", "-1.7976931348623157E308", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=0.0, getStartValue=-0.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"5", "<sample:1>", "1.7976931348623157E308", "1.7976931348623157E308", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "1.7976931348623157E308", "1.7976931348623157E308", "4.9E-324"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 33, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 34, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 35, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 36, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 37, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:3>", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:6>", "1.0", "0.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.053001", "1.0E-6", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:6>", "-1.0", "0.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "0.053001", "1.0E-6", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-Infinity", "0.0"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "-Infinity", "0.0"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-1", "<sample:7>", "-Infinity", "0.0"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"0", "<sample:9>", "-4.4942328371557893E307", "1.0"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getStartValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-1", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:6>", "NaN", "-1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-1", "<null>", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:6>", "NaN", "-1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:3>", "NaN", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=N...#203#1750827729", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:3>", "NaN", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN...#201#-2126361188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:3>", "NaN", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "doSolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:3>", "-1.0", "0.5", "1.0", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:0>", "NaN", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:0>", "NaN", "2.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=2.6, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<null>", "0.5", "Infinity", "1.0", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"0", "<sample:6>", "-0.5", "Infinity", "0.1", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:7>", "1.7976931348623157E308", "1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "1.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:7>", "1.7976931348623157E308", "0.0", "0.5", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:0>", "1.7976931348623157E308", "0.0", "0.5", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:6>", "NaN", "0.5", "NaN", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"1", "<sample:7>", "NaN", "-1.7976931348623157E308", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:6>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:3>", "NaN", "1.7976931348623157E308", "-4.4942328371557893E307"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "NaN", "1.7976931348623157E308", "-4.4942328371557893E307"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-4....#221#227222071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "NaN", "1.7976931348623157E308", "-4.4942328371557893E307"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-4....#221#227222071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "0.5", "1.7976931348623157E308", "-4.4942328371557893E307"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=-4....#221#-1837654885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:8>", "NaN", "1.7976931348623157E308", "-4.4942328371557893E307"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-4.49423283...#213#1795666980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:6>", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:6>", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:6>", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=-2147483648, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-2147483648", "<sample:6>", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=-2147483648, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:6>", "-4.4942328371557893E307", "-1.7976931348623157E308", "-1.7976931348623157E308", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "-4.4942328371557893E307", "0.5", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=10, getMin=-4.4942328371557893E307, getRelativeAccuracy=1.0E-14, getSta...#232#56326518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "-1.0", "-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "1.7976931348623157E308", "1.0", "-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.7976931348623157E308", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-2147483648, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-4...#222#1266138233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "1.7976931348623157E308", "-1.0", "-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "Infinity", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=-2147483648, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=-...#223#644861758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-4.4942328371557893E307", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "39.0"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "39.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:5>", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:7>", "0.0", "1.0E-6", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=1.0E-6, getMaxEvaluations=-2147483648, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"Infinity", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<null>", "-1.0", "-4.4942328371557893E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:7>", "0.0", "1.0E-6", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-Infinity", "0.1"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<null>", "1.0", "-4.4942328371557893E307", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "NaN", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMin", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "NaN", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.0E-6", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "NaN", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "1.0E-6", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "-4.4942328371557893E307"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "1.7976931348623157E308", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=2, getFunctionValueAccuracy=-1.0, getMax=Infinity, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=Infinity, getStartVal...#212#2030748703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.31", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "1.7976931348623157E308", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValu...#211#2047750288", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.155", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:7>", "1.7976931348623157E308", "Infinity", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=Infini...#203#1364703869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-0.155", "-8.988465674311579E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:6>", "Infinity", "0.5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=10, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:5>", "1.7976931348623157E308", "0.5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:5>", "1.7976931348623157E308", "0.05", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:7>", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.05, getMaxEvaluations=10, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"0.0", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:7>", "-4.4942328371557893E307", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "-4.4942328371557893E307", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557893E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=2147483647, getMin=-4.4942328371557893E307, getRelativeAccuracy=1.0E-...#242#-1281137710", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:5>", "-4.4942328371557893E307", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isBracketing", "double,double", "0.5", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "1.0E-6", "0.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557893E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=2147483647, getMin=-4.4942328371557893E307, getRelativeAccuracy=1.0E-14,...#239#1253230655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-2147483648", "<sample:6>", "0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=NaN, getMaxEvaluations=-2147483648, getMin=NaN, getRelativeAccuracy=-1.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "0.0", "Infinity", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "0.0", "1.0E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "0.0", "1.0E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:4>", "0.0", "1.0E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=10, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<null>", "Infinity", "0.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<null>", "0.0", "-1.7976931348623157E308", "0.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.7976931348623157E308", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "-1.7976931348623157E308", "-4.4942328371557893E307", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=2147483647, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-...#222#-673457610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "1.7976931348623157E308", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN...#201#-1790708682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:5>", "Infinity", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:7>", "Infinity", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"5", "<sample:1>", "1.7976931348623157E308", "1.7976931348623157E308", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"10", "<sample:6>", "1.0", "0.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "isSequence", "double,double,double", "1.0E-6", "1.0E-6", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=10, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:6>", "-Infinity", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:6>", "-Infinity", "0.0"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:7>", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"0", "<sample:8>", "Infinity", "0.1"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<null>", "-4.4942328371557893E307", "1.0E-6", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "1.0E-6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:6>", "-1.7976931348623157E308", "0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=-2147483648, getMin=-1.7976931348623157E308, getRelativeAccuracy=Infinity, getStartValue=...#204#1181797039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-1", "<sample:0>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:6>", "NaN", "-1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"NaN", "-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "10", "<sample:7>", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:3>", "1.0E-6", "Infinity", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=-1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:7>", "1.7976931348623157E308", "1.0", "NaN", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-1, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:0>", "-1.7976931348623157E308", "NaN", "1.7976931348623157E308", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:0>", "-Infinity", "NaN", "1.7976931348623157E308", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:0>", "1.0E-6", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=1.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=8.988465...#214#-1939527044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-4.4942328371557893E307", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.9999999999999999", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:0>", "2.0E-6", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=2.0E-6, getRelativeAccuracy=1.0E-14, getStartValue=8.988465...#214#1399918973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"-4.4942328371557893E307", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "0.9999999999999999", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "-1", "<sample:0>", "2.0E-6", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=2.0E-6, getRelativeAccuracy=1.0, getStartValue=8.988465...#214#23303791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-2147483648", "<null>", "-4.4942328371557893E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"-2147483648", "<sample:6>", "2.247116418577895E307"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.0E-6", "-1.44"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "1", "<sample:3>", "1.0E-6", "1.0E-6"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"11.000000100000001", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:1>", "-1.7976931348623157E308", "-4.4942328371557893E307", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1235582092889474E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=-2147483648, getMin=-1.7976931348623157E308, getRelativeAccuracy=1....#241#1987300887", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "0.5", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "0.5", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "NaN", "0.5", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:6>", "1.0", "1.0E-6", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=1.0E-6, getMaxEvaluations=2147483647, getMin=1.0, getRelativeAccuracy=Infinity, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.986", "-1.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.986", "-1.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifySequence", "double,double,double", "0.986", "-1.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "computeObjectiveValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:4>", "Infinity", "-1.0", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=0, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:4>", "Infinity", "-1.0", "-0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.0", "-24.999999"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=0, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:4>", "Infinity", "-1.0", "-0.5"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-1.7976931348623157E308", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "-1.0", "-4.4942328371557893E307", "1.7976931348623157E308", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=1...#222#-63929284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483647", "<sample:7>", "-0.5", "-4.4942328371557893E307", "1.7976931348623157E308", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=-2147483647, getMin=-0.5, getRelativeAccuracy=1.0E-14, getStartValue=...#223#1292017722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "-4.4942328371557893E307", "NaN", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=10, getMin=-4.4942328371557893E307, getRelativeAccuracy=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "-4.4942328371557893E307", "NaN", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "1.0", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=NaN, getMaxEvaluations=10, getMin=-4.4942328371557893E307, getRelativeAccuracy=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-1", "<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ge...#216#-395077424", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-15", "<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=-15, getMin=-1.7976931348623157E308, getRelativeAccuracy=0.0, getStartVa...#209#1603792590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-15", "<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-15, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#215#-497076995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-15", "<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-15, getMin=-1.7976931348623157E308, getRelativeAccuracy=1.0E-14, ge...#217#1648298794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-15", "<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-15, getMin=-1.7976931348623157E308, getRelativeAccuracy=-Infinity, getS...#215#-989287023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.5", "-1.0", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.0, getMaxEvaluations=1, getMin=0.5, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMax", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:1>", "0.5", "-1.0", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=-1.0, getMaxEvaluations=1, getMin=0.5, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"-2147483648", "<null>", "-Infinity", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:2>", "NaN", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:4>", "-Infinity", "10.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "NaN", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=10.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:4>", "-Infinity", "10.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "NaN", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=10.0, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:3>", "-Infinity", "10.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "NaN", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"2147483647", "<sample:2>", "-Infinity", "Infinity"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "1", "<sample:2>", "NaN", "1.0", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "doSolve", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=2147483647, getMin=-Infinity, getRelativeAccuracy=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "0", "<sample:6>", "1.7976931348623157E308", "1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=0, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStar...#231#28969052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "-1.7976931348623157E308", "-2.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "19.0"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-1.0", "1.0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:7>", "-1.0", "-10.0", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-10.0, getMaxEvaluations=2147483647, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-5.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2147483647", "<sample:6>", "-1.0", "-10.0", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483647", "<sample:6>", "-1.0", "-10.0", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"16385", "<sample:2>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=16385, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"16385", "<sample:3>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "2147483647", "<sample:3>", "1.0E-6", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<null>", "1.0", "0.5", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:4>", "1.0", "-4.4942328371557893E307", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557893E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=-4.4942328371557893E307, getMaxEvaluations=2, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=-2.24711641...#213#862700545", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyInterval", "double,double", "0.0", "1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"9.999999999999999E-6", "1.0E-7", "0.88"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-4.4942328371557893E307", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-42.99999", "1.0E-7", "0.88"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-4.4942328371557893E307", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-42.99999", "5.000001", "0.88"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "-4.4942328371557893E307", "-4.9E-324"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "264.50005", "4.934999999999998"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "NaN", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "1", "<sample:1>", "1.7976931348623157E308", "Infinity", "1.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=1, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.0", "1.7976931348623157E308"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "0.5", "1.0", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:1>", "0.5", "1.0", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-4.4942328371557893E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "0.5", "1.0", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:1>", "0.5", "1.0", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0, getStartValue=-4.4942328371557893E307...#201#-1787590072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "0.5", "1.0", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:1>", "0.5", "1.0", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=1.0, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=Infinity, getStartValue=-4.4942328371557893E...#204#549527509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "10", "<sample:0>", "0.5", "1.0", "-4.4942328371557893E307"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "-2147483648", "<sample:1>", "0.5", "1.0", "-4.4942328371557893E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=-2147483648, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=-4.4942328371557893E3...#203#1989402566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "26", "<sample:7>", "NaN", "1.7976931348623157E308", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=26, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:4>", "NaN"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:7>", "Infinity"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"2147483647", "<sample:7>", "1.7976931348623157E308"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"10", "<sample:7>", "1.7976931348623157E308"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=10, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "2147483647", "<sample:0>", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "verifyBracketing", "double,double", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "Infinity", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double", "-1", "<sample:0>", "-4.4942328371557893E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-4.4942328371557893E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:1>", "1.7976931348623157E308", "0.5", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=0.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:1>", "1.7976931348623157E308", "0.5", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=2, getFunctionValueAccuracy=-Infinity, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0, getStartValue=NaN...#201#291146090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "2147483647", "<sample:1>", "1.7976931348623157E308", "0.5", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=2, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartValue=NaN...#201#-1945564078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateRealFunction", "double"}, new String[]{"0", "<sample:10>", "-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<sample:3>", "1.7976931348623157E308", "1.7976931348623157E308", "Infinity", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMax", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=0.0, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BaseSecantSolver", "org.apache.commons.math.analysis.solvers.IllinoisSolver", "getStartValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BaseSecantSolver", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
