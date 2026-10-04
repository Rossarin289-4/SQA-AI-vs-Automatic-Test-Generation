package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"2", "<sample:7>", "0.358", "1.0", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.679", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=2, getMaximalOrder=5, getMin=0.358, getRelativeAccuracy=1.0E-14, getStartValue=0.679}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1073741886", "<sample:7>", "-2.0", "0.5", "-1.0", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=1073741886, getMaximalOrder=6, getMin=-2.0, getRelativeAccuracy=0.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:7>", "NaN", "1.0", "1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:6>", "-9.96"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.96", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=3, getFunctionValueAccuracy=Infinity, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=2, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=-9.96}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"3", "<sample:4>", "-1.7976931348623157E308", "NaN", "0.0625", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.0E-6", "0.0625", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-3", "<sample:4>", "-1.7976931348623157E308", "NaN", "0.125", "<sample:9>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-16218", "<sample:8>", "8.988465674311578E307", "8.3", "-2.6475000000000004", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-1", "<sample:6>", "1.7976931348623157E308", "Infinity", "5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "1.7976931348623157E308"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"3", "<sample:4>", "0.0", "0.0", "5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=3, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0E-6", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0E-6", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "-1.0E-6", "0.025"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.0", "1.0E-6", "0.025"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<sample:1>", "2", "0.0", "0.5", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "5", "-1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483647", "<sample:7>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "10", "<sample:4>", "5", "5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0...#201#1323797142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483637", "<sample:7>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "10", "<sample:4>", "5", "5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483637, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0...#201#540418167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483637", "<sample:6>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "10", "<sample:4>", "5", "5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"1073741823", "<sample:5>", "0.358"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "10", "<sample:4>", "5", "5", "0.5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"1073741823", "<null>", "-0.358"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"1073741823", "<sample:7>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1073741823, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.7...#220#-571519604", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"-1", "<sample:6>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "3", "<sample:7>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=4, getMin=1.7976931348623157E308, getRelativeAccuracy=Infinity, getSta...#230#-626725890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "3", "<sample:7>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStar...#229#1671704388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "3", "<sample:7>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=4, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStartV...#227#-724530546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "3", "<sample:7>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=6, getMin=1.7976931348623157E308, getRelativeAccuracy=0.0, getStartValue=...#222#275184909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "3", "<sample:7>", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=8, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0, getStar...#229#1354546463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0625", "0.0625"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "0.0625"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=32, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2", "<sample:5>", "5", "5", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.358", "0.358"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "1.0", "0.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-39", "<sample:2>", "20.84", "-0.5", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.358", "0.0358"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.0625", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:4>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=2, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.0625", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:4>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=4, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "0.0625", "1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "268435458", "<sample:4>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=3, getFunctionValueAccuracy=-1.0, getMax=NaN, getMaxEvaluations=268435458, getMaximalOrder=4, getMin=NaN, getRelativeAccuracy=Infinity, getStartValue=1.0...#201#-1822357618", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2147483647", "<sample:6>", "1.0E-6", "0.0625", "0.358"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2", "<null>", "0.25", "4.9999999999999996E-6", "NaN"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "5", "<sample:1>", "-1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1073741832", "<null>", "2", "1.0", "-1.7976931348623157E308"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1073741832", "<sample:0>", "2", "1.0", "-1.7976931348623157E308"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=1.0, getMaxEvaluations=1073741832, getMaximalOrder=5, getMin=2.0, getRelativeAccuracy=1.0E-14, getStartValue=-1....#221#568470685", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:5>", "1.0E-6", "1.7976931348623157E308", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:4>", "1.0E-6", "Infinity", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "1", "<sample:3>", "NaN", "1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-59", "<sample:4>", "1.0E-6", "-Infinity", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"5", "0.5000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2", "<sample:4>", "-1.0", "5", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.308", "0.125"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0E-6", "0.0625"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0E-6", "0.0625"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0E-6", "0.0625"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "0", "<sample:0>", "1.0", "NaN", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "0", "<sample:0>", "1.0", "NaN", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"3", "<sample:4>", "-3.5953862697246315E307", "NaN", "-11.875", "<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "2147483647", "<sample:2>", "1.0E-6", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"59", "<sample:4>", "8.988465674311579E306", "NaN", "-2.6475000000000004", "<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"-1.0", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"-1", "<sample:7>", "0.0625", "1.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "-1.7976931348623157E308", "2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "1.0E-6", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"Infinity", "1.0E-6", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-1.0E-6", "0.5"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "-Infinity", "0.056004"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=32, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:1>", "1.7976931348623157E308", "0.0625", "0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#214#-1524760918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:1>", "1.7976931348623157E308", "0.0625", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:3>", "5", "-1.0", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#214#-1524760918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:3>", "1.7976931348623157E308", "0.0625", "13.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "-1.0", "2", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#215#-21879910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:3>", "1.7976931348623157E308", "0.0625", "-13.0"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "-1.0", "2", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getS...#216#-794496085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:3>", "1.7976931348623157E308", "0.0625", "-13.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "-1.0", "2", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=4, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getSta...#214#1375301887", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"0", "<sample:3>", "Infinity", "0.0625", "-13.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "-1.0", "2", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=0, getMaximalOrder=4, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartValue=-13.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-1", "<null>", "0.5", "0.0625", "2", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"6", "<sample:3>", "-1.0", "0.5", "0.0625"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"3", "<sample:3>", "-1.0", "0.5", "0.0125"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "Infinity", "0.0625", "0.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"4", "<sample:2>", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<null>", "Infinity", "5", "0.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=4, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"4", "<sample:2>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<null>", "Infinity", "5", "0.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=4, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"4", "<sample:2>", "4.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<null>", "Infinity", "5", "0.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=4, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=4.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"16777220", "<sample:2>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=16777220, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"-520093692", "<sample:2>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"-520093692", "<sample:2>", "2.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483647", "<sample:6>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:3>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"2147483647", "<sample:7>", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483647", "<sample:3>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=2.0...#201#1323797142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "NaN", "-1.7976931348623157E308"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "NaN", "-1.7976931348623157E308"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-2147483648", "<sample:6>", "NaN", "0.358", "NaN", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:5>", "-1.0", "NaN", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "1073741823", "<sample:2>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=1073741823, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1....#202#214752790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2147483646", "<sample:2>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483646, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1....#202#1595094347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "0.358", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "1.7976931348623157E308", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=256, getMin=1.7976931348623157E308, getRelativeAccuracy=Infinity, g...#236#1615203878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=256, getMin=1.7976931348623157E308, getRelativeAccuracy=Infinity, g...#235#-489949368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=5, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0E-14, getStar...#229#1671704388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=2, getMin=1.7976931348623157E308, getRelativeAccuracy=0.0, getStartValue...#223#2112771672", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "3.58", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "5", "<sample:6>", "1.7976931348623157E308", "0.5", "8.988465674311579E307", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=5, getMaximalOrder=2, getMin=1.7976931348623157E308, getRelativeAccuracy=1.0, getStartV...#227#1510404611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=32, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:7>", "0.5", "0.358", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=256, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"NaN", "2"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"2", "-46.0"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.4825", "Infinity"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "1610612735", "<sample:1>", "0.06250000000000001", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=1610612735, getMaximalOrder=5, getMin=0.06250000000000001, getRelative...#254#-1752811950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:0>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:4>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=2147483647, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:4>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2, getMaximalOrder=2, getMin=NaN, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2", "<sample:4>", "1.0", "1.0E-6", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2", "<sample:2>", "0.5", "5.0E-7", "NaN"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=5.0E-7, getMaxEvaluations=2, getMaximalOrder=100, getMin=0.5, getRelativeAccuracy=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"2", "<null>", "0.5", "5.0E-7", "NaN"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "5", "<sample:1>", "-1.7976931348623157E308", "-1.7976931348623157E308", "NaN"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"1073741823", "<null>", "2", "1.0", "-1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"1", "<sample:5>", "1.0E-6", "1.7976931348623157E308", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0625", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0625", "0.5000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2", "<sample:4>", "-1.0", "5", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=2, getMaximalOrder=5, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "1.0E-6", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "1.0E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "1.0E-6", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "0", "<sample:6>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=NaN, getRelativeAccuracy=0.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "6", "<sample:3>", "1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=6, getMaximalOrder=32, getMin=1.0, getRelativeAccuracy=-Infinity, getSta...#230#662906031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "6", "<sample:5>", "NaN", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=2.0, getMaxEvaluations=6, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "6", "<sample:5>", "NaN", "2"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "1073741823", "<sample:2>", "Infinity", "0.0625", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=1073741823, getMaximalOrder=5, getMin=Infinity, getRelativeAccuracy=1.0E-14, getStartV...#209#-1728935560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"4", "<null>", "1.7976931348623158E307", "NaN", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "10", "<sample:6>", "5"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", "double,double", "NaN", "57.013"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2", "<sample:2>", "-1.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "2", "<sample:6>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=2, getMaximalOrder=5, getMin=-1.0, getRelativeAccuracy=1.0E-14, getSta...#230#1708142384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2", "<sample:2>", "1.7976931348623157E308", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"2", "<null>", "1.7976931348623157E308", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-2", "<null>", "1.7976931348623157E308", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double"}, new String[]{"-2", "<sample:1>", "Infinity", "Infinity"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"4", "<sample:0>", "5", "Infinity", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=4, getMaximalOrder=5, getMin=5.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976...#217#-44789051", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"4", "<sample:1>", "50.0", "Infinity", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "1.0", "0.5", "0.358", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=4, getMaximalOrder=5, getMin=50.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.797...#218#-1403155953", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"8", "<sample:0>", "5", "Infinity", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "1.0", "0.5", "0.358", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=8, getMaximalOrder=5, getMin=5.0, getRelativeAccuracy=1.0E-14, getStartValue=-1.7976...#217#1635893449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"4", "<sample:2>", "5", "Infinity", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "1.0", "0.5", "0.358", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=4, getMaximalOrder=5, getMin=5.0, getRelativeAccuracy=1.0E-14, getStartValue=-8.9884...#216#-543497527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"4", "<sample:2>", "5", "Infinity", "-8.988465674311579E306"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:5>", "1.0", "0.5", "0.358", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=4, getMaximalOrder=5, getMin=5.0, getRelativeAccuracy=1.0E-14, getStartValue=-8.9884...#216#-543497558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"-2147483648", "<sample:1>", "NaN", "0.125", "-Infinity", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "4", "<sample:1>", "0.0", "0.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.5, getMaxEvaluations=4, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 24, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"4", "<null>", "-4.099999", "0.5", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=32, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.0", "2"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:0>", "1.0E-6", "0.358", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"16.000000000000004", "3.9219999999999997"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:0>", "1.0E-6", "0.358", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-Infinity"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "5"}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:1>", "-1.0", "NaN", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=-1.0, getRelativeAccuracy=1.0E-14, getStartValue=Na...#202#597720506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "1.0E-6"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.0E-6", "1.7976931348623157E308", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.0", "-0.045001"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.0E-6", "1.7976931348623157E308", "0.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "NaN", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-1.7976931348623158E307", "0.20000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "1.7976931348623157E308", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:7>", "-1.7976931348623157E308", "0.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<null>", "-1.7976931348623157E308", "1.0", "1.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=6, getMaximalOrder=4, getMin=-1.7976931348623157E308, getRelativeAccuracy=Infinity, getSt...#232#-714391728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "1.0E-6", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "10", "<sample:6>", "-1.7976931348623157E308", "1.7976931348623157E308", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=10, getMaximalOrder=5, getMin=-1.7976931348623157E308, getRelativeAccu...#235#1323905163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"10", "<sample:7>", "1.0E-6", "0.0", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.5", "0.5", "0.0625"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.5", "0.5", "0.0625"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0E-6", "Infinity", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:1>", "Infinity", "0.0625", "NaN", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0E-6", "10.0", "64.9"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:1>", "0.0", "0.0625", "NaN", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=6, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"2.0E-6", "9.999999999999998", "64.9"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "org.apache.commons.math.analysis.solvers.AllowedSolution"}, new String[]{"134217862", "<sample:2>", "-8.988465674311579E306", "1.0E-6", "<sample:6>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557894E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=134217862, getMaximalOrder=8, getMin=-8.988465674311579E306, getRelativeAccuracy=1....#245#1621979218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-1", "<sample:6>", "-1.0", "0.0", "0.0625"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=-1, getMaximalOrder=8, getMin=-1.0, getRelativeAccuracy=1.0, getStartValue=0.0625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"5", "<sample:6>", "100.0", "-1.7976931348623158E307", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "5", "<sample:3>", "0.358", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "-1", "<sample:6>", "1.0E-7", "0.5", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623158E307, getMaxEvaluations=5, getMaximalOrder=5, getMin=100.0, getRelativeAccuracy=1.0E-14, getS...#214#-890809885", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.358", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.358", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "5", "<sample:5>", "-1.7976931348623157E308", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=5, getMaximalOrder=2147483647, getMin=-1.7976931348623157E308, getRelati...#254#-238239812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", new String[]{"double", "double"}, new String[]{"0.358", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "5", "<sample:5>", "-8.988465674311579E307", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=-1.7976931348623157E308, getMaxEvaluations=5, getMaximalOrder=2147483647, getMin=-8.988465674311579E307, getRelativ...#253#782644139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.00625"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "1.0E-6", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:3>", "0.0625", "5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=10, getMaximalOrder=12, getMin=0.0625, getRelativeAccuracy=1.0E-14, getStartValue=2.531...#203#-128526401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "1.0E-6", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:3>", "0.0625", "5", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=10, getMaximalOrder=12, getMin=0.0625, getRelativeAccuracy=1.0E-14, getStartValue=2.531...#203#-128526401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "1.0E-7", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:2>", "0.0625", "-1.0", "<sample:2>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "10", "<sample:3>", "0.0625", "5", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=4, getFunctionValueAccuracy=1.0E-15, getMax=5.0, getMaxEvaluations=10, getMaximalOrder=5, getMin=0.0625, getRelativeAccuracy=1.0E-14, getStartValue=2.53125}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getEvaluations", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:3>", "0.0", "NaN", "0.5", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483639", "<sample:3>", "0.0", "NaN", "0.5", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=6, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:6>", "0.358", "1.7976931348623157E308", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMaximalOrder=6, getMin=0.358, getRelativeAccuracy=0.0, getStartVal...#225#1175272259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "-1", "<sample:6>", "0.358", "1.7976931348623157E308", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMaximalOrder=8, getMin=0.358, getRelativeAccuracy=1.0, getS...#232#1849652883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=-Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=8, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=10, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=Infinity, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=12, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=32, getMin=0.0, getRelativeAccuracy=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaximalOrder", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "0.358", "Infinity", "0.34"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getEvaluations=1, getFunctionValueAccuracy=1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=100, getMin=0.0, getRelativeAccuracy=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "1.0"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "4", "<sample:2>", "-1.0", "0.0625", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=0.0625, getMaxEvaluations=4, getMaximalOrder=2147483647, getMin=-1.0, getRelativeAccuracy=0.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"1073741823", "<null>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "0.358"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "-1.0", "NaN", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"4", "<sample:3>", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "15.0", "NaN", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double"}, new String[]{"4", "<sample:7>", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", "double,double,double", "-30.0", "NaN", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=4, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getStartValue", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "2147483647", "<sample:4>", "0.5", "2", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=2.0, getMaxEvaluations=2147483647, getMaximalOrder=5, getMin=0.5, getRelativeAccuracy=1.0E-14, getStartValue=1.2...#202#-696703087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "3", "<sample:4>", "Infinity", "Infinity", "1.0", "<null>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMin", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=Infinity, getMaxEvaluations=3, getMaximalOrder=2, getMin=Infinity, getRelativeAccuracy=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "0", "<null>", "Infinity", "0.0", "<sample:0>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifyInterval", "double,double", "4.0", "2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "-1", "<sample:7>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=-1, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"3.610001"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "setup", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,double", "2", "<sample:2>", "1.0", "1.0E-6", "0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=1, getFunctionValueAccuracy=1.0E-15, getMax=1.0E-6, getMaxEvaluations=2, getMaximalOrder=5, getMin=1.0, getRelativeAccuracy=1.0E-14, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "2", "-1.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=5, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "1.0", "-2.0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"6", "<sample:0>", "-1.7976931348623157E308", "0.625", "0.358"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "isBracketing", "double,double", "0.0", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoBracketingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", new String[]{"int", "org.apache.commons.math.analysis.UnivariateFunction", "double", "double", "double"}, new String[]{"6", "<sample:0>", "-1.7976931348623157E308", "0.625", "0.358"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "doSolve", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double,org.apache.commons.math.analysis.solvers.AllowedSolution", "6", "<sample:3>", "1.7976931348623157E308", "2", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double,double", "1073741823", "<sample:6>", "NaN", "0.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.0625", "NaN", "5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "5", "<sample:1>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=5, getMaximalOrder=5, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"0.0625", "NaN", "5"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "solve", "int,org.apache.commons.math.analysis.UnivariateFunction,double", "5", "<sample:1>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=3, getFunctionValueAccuracy=1.0E-15, getMax=NaN, getMaxEvaluations=5, getMaximalOrder=4, getMin=NaN, getRelativeAccuracy=1.0E-14, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-45.0", "NaN", "0.179"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "verifySequence", "double,double,double", "Infinity", "0.0625", "0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=1.0E-14, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "computeObjectiveValue", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2, getMin=0.0, getRelativeAccuracy=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getEvaluations=0, getFunctionValueAccuracy=1.0E-15, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=2147483647, getMin=0.0, getRelativeAccuracy=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getEvaluations=0, getFunctionValueAccuracy=-1.0, getMax=0.0, getMaxEvaluations=0, getMaximalOrder=4, getMin=0.0, getRelativeAccuracy=Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
