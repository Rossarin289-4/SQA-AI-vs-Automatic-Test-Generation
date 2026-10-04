package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"55", "<sample:11>", "<sample:4>", "NaN", "-1.5", "0.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-1.5, getMaxEvaluations=55, getMin=NaN, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"22", "<sample:4>", "<sample:2>", "-0.9999999999999999", "Infinity"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:0>", "10.0", "5.000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "55", "<sample:14>", "<sample:7>", "-Infinity", "0.516", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=7.5, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.000000000000001, getMaxEvaluations=2147483647, getMin=10.0, getStartValue=7.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2049", "<sample:5>", "<sample:9>", "NaN", "-1.0", "3.0000000000000004"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.0000000000000004, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=2049, getMin=NaN, getStartValue=3.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"51", "<sample:5>", "<sample:5>", "Infinity", "Infinity", "5.0"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"55", "<sample:3>", "<sample:1>", "NaN", "2.0", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"55", "<sample:8>", "<sample:0>", "NaN", "-Infinity", "1.7976931348623153E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-3", "<sample:8>", "<sample:6>", "-Infinity", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-53", "<sample:3>", "<sample:6>", "-5.000000000000001", "2.58", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-10.000000000000002"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.52"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:5>", "<sample:4>", "0.5", "5.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=2.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:7>", "<sample:3>", "3.0", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "<sample:0>", "-Infinity", "Infinity", "NaN"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:4>", "<sample:6>", "2.0569999999999995", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=1, getMin=2.0569999999999995, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2", "<sample:1>", "<sample:3>", "Infinity", "NaN"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"8388610", "<sample:0>", "<null>", "4.113999999999999", "30.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"62", "<sample:5>", "<sample:7>", "-Infinity", "1.7976931348623155E308", "Infinity"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:8>", "<sample:9>", "1.0000000000000002", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:6>", "<sample:0>", "10.0", "-1.7976931348623157E308", "-Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-22", "<sample:5>", "<null>", "-1.5", "-1.5", "1.014"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"7", "<sample:4>", "<sample:4>", "0.5000000000000001", "4.113999999999999"}, false, 7, new String[][]{}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=4.113999999999999, getMaxEvaluations=7, getMin=0.5000000000000001, getStartValue=2.3069999999999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-1", "<sample:3>", "<sample:2>", "2.0", "-0.5"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-65469", "<sample:9>", "<sample:5>", "-0.9999999999999999", "5.999999999999999"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"116", "<sample:3>", "<sample:5>", "5.0", "8.988465674311579E307"}, false, 2, new String[][]{}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=8.988465674311579E307, getMaxEvaluations=116, getMin=5.0, getStartValue=4.4942328371557893E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-11", "<sample:4>", "<sample:6>", "20.0", "NaN"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "55", "<sample:6>", "<sample:7>", "0.9999999999999999", "-1.0", "2.189"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=0.9999999999999999, getStartValue=2.189}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "<sample:6>", "4.973", "1.0095000000000003", "2.019"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"10", "<sample:2>", "<sample:4>", "2.0", "NaN", "-2.0"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"22", "<sample:7>", "<sample:1>", "Infinity", "5.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-106", "<sample:12>", "<sample:3>", "4.963", "1.7976931348623155E308", "1.0095"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:7>", "0.5", "2.0189999999999997"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "22", "<sample:6>", "<sample:4>", "1.7976931348623157E308", "5.0", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.7976931348623157E308, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=22, getMin=1.7976931348623157E308, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"48", "<sample:10>", "<sample:1>", "5.0", "-0.5000000000000001"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.25, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.5000000000000001, getMaxEvaluations=48, getMin=5.0, getStartValue=2.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"35", "<sample:7>", "<sample:0>", "0.0", "-0.49999999999999994", "0.25"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "6"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.49999999999999994, getMaxEvaluations=35, getMin=0.0, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"22", "<sample:11>", "<sample:0>", "2.039", "2.0189999999999997"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.029, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0189999999999997, getMaxEvaluations=22, getMin=2.039, getStartValue=2.029}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"57", "<sample:10>", "<null>", "2.0", "-1.7976931348623157E308"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:1>", "<sample:6>", "2.0", "-1.0094999999999998"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-3.0"}}, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.49524999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0094999999999998, getMaxEvaluations=5, getMin=2.0, getStartValue=0.49524999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:11>", "<sample:5>", "2.019", "4.963"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.963, getMaxEvaluations=2147483647, getMin=2.019, getStartValue=3.491}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"20", "<sample:1>", "<sample:7>", "2.0369999999999995", "-1.7976931348623157E308"}, false, 7, new String[][]{}, 3), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=20, getMin=2.0369999999999995, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:2>", "-1.7976931348623157E308", "-1.0095"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0095, getMaxEvaluations=6, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"0", "<sample:6>", "<sample:7>", "0.9999999999999999", "-0.9999999999999998", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<sample:2>", "<sample:0>", "-Infinity", "-0.5319999999999999", "5.0"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"22", "<sample:2>", "<sample:5>", "-4.037999999999999", "1.9689999999999999"}, false, 2, new String[][]{}, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0344999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.9689999999999999, getMaxEvaluations=22, getMin=-4.037999999999999, getStartValue=-1.0344999999999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:10>", "<sample:0>", "20.0", "2.019"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.0095", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.019, getMaxEvaluations=!NullPointerException, getMin=20.0, getStartValue=11.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-56", "<sample:15>", "<sample:2>", "1.7976931348623157E308", "2.019"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.019, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:0>", "<sample:2>", "30.0", "-1.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-1073741824", "<sample:3>", "<sample:5>", "3.0", "3.034"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:2>", "<sample:7>", "-Infinity", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "4.999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1073741823", "<sample:2>", "<sample:5>", "2.4999999999999996", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=2.4999999999999996, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"4098", "<sample:0>", "<sample:6>", "2.019", "NaN", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0189999999999997"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:2>", "<sample:7>", "2.019", "0.25"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.25, getMaxEvaluations=!NullPointerException, getMin=2.019, getStartValue=1.1345}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "134217738", "<sample:4>", "<sample:2>", "4.113999999999999", "5.2", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.2, getMaxEvaluations=!NullPointerException, getMin=4.113999999999999, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-53", "<null>", "<sample:2>", "-1.7976931348623157E308", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:3>", "5.000000000000001", "-1.0095"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.9952500000000004, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0095, getMaxEvaluations=2147483647, getMin=5.000000000000001, getStartValue=1.9952500000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"60", "<sample:1>", "<sample:7>", "-56.0", "-1.7976931348623157E308", "0.0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=60, getMin=-56.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-4", "<sample:6>", "<null>", "Infinity", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:2>", "<sample:0>", "Infinity", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:9>", "<null>", "1.7976931348623157E308", "3.0", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:3>", "<sample:6>", "-1.0095", "-1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0000000000000002, getMaxEvaluations=0, getMin=-1.0095, getStartValue=-1.00475}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "247", "<sample:11>", "<sample:9>", "0.49999999999999994", "3.52"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.52, getMaxEvaluations=!NullPointerException, getMin=0.49999999999999994, getStartValue=2.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-37", "<sample:7>", "<sample:2>", "0.9999999999999999", "4.999999999999999", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=4.999999999999999, getMaxEvaluations=!NullPointerException, getMin=0.9999999999999999, getStartValue=-0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:2>", "<sample:4>", "3.0", "-Infinity"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"10", "<sample:6>", "<sample:3>", "1.7976931348623157E308", "1.0000000000000002"}, false, 2, new String[][]{}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0000000000000002, getMaxEvaluations=10, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2", "<sample:0>", "<sample:4>", "5.000000000000001", "2.0", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=-2, getMin=5.000000000000001, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:0>", "-0.49524999999999997", "-2.0000000000000004", "-2.019"}, false, 2, new String[][]{}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-2.0000000000000004, getMaxEvaluations=2147483647, getMin=-0.49524999999999997, getStartValue=-2.019}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4", "<sample:1>", "<sample:7>", "0.50475", "2.5000000000000004"}, false, 2, new String[][]{}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5023750000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.5000000000000004, getMaxEvaluations=4, getMin=0.50475, getStartValue=1.5023750000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:12>", "<sample:1>", "-15.0", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-15.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"44", "<sample:1>", "<sample:2>", "1.99", "-1.0195000000000003"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.48524999999999996, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0195000000000003, getMaxEvaluations=44, getMin=1.99, getStartValue=0.48524999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:3>", "<sample:5>", "-1.7976931348623155E308", "-6.199999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E307, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-6.199999999999999, getMaxEvaluations=5, getMin=-1.7976931348623155E308, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"12", "<sample:6>", "<sample:7>", "0.0", "-8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.4942328371557893E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-8.988465674311579E307, getMaxEvaluations=12, getMin=0.0, getStartValue=-4.4942328371557893E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-212", "<sample:15>", "<sample:8>", "-2.001", "-1.5000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.5000000000000002, getMaxEvaluations=!NullPointerException, getMin=-2.001, getStartValue=-1.7505000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"52", "<sample:4>", "<sample:1>", "2.0190000000000006", "4.037999999999999", "-2.019"}, false, 2, new String[][]{}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.019", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.037999999999999, getMaxEvaluations=52, getMin=2.0190000000000006, getStartValue=-2.019}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:7>", "<sample:4>", "NaN", "0.4999999999999999", "2.0000000000000004"}, false, 7, new String[][]{}), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.4999999999999999, getMaxEvaluations=1073741823, getMin=NaN, getStartValue=2.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "262144", "<sample:1>", "<sample:2>", "1.7976931348623155E308", "Infinity", "-50.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-50.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623155E308, getStartValue=-50.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.73"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"55", "<sample:1>", "<sample:4>", "1.0095000000000003", "1.7976931348623155E308"}, false, 7, new String[][]{}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623155E308, getMaxEvaluations=55, getMin=1.0095000000000003, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:4>", "<sample:0>", "6.0", "-45.943"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-19.9715, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-45.943, getMaxEvaluations=1, getMin=6.0, getStartValue=-19.9715}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1024", "<sample:7>", "<sample:2>", "2.019", "0.5", "-4.963"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-4.963, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=1024, getMin=2.019, getStartValue=-4.963}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:3>", "<sample:10>", "-1.0095", "3.0", "30.000000000000004"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=30.000000000000004, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=2147483647, getMin=-1.0095, getStartValue=30.000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "12", "<sample:11>", "<sample:6>", "0.5", "1.0095"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75475", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.0095, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=0.75475}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:9>", "<sample:9>", "2.59", "50.000000000000014", "1.0095"}, false, 7, new String[][]{}), new String[][]{{"getValue", "", "1"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=50.000000000000014, getMaxEvaluations=2147483647, getMin=2.59, getStartValue=1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:7>", "<sample:4>", "-0.0", "-1.0095", "500.00000000000006"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("500.00000000000006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0095, getMaxEvaluations=2147483647, getMin=-0.0, getStartValue=500.00000000000006}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1028", "<sample:12>", "<sample:5>", "1.0", "1.0", "-0.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=-0.9999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.50475"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-22", "<sample:2>", "<sample:6>", "Infinity", "10.0", "44.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("44.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=10.0, getMaxEvaluations=-22, getMin=Infinity, getStartValue=44.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "43.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:2>", "<sample:8>", "1.7976931348623157E308", "1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0000000000000002, getMaxEvaluations=4, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "22", "<sample:4>", "<sample:9>", "0.0", "-1.0", "100.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=22, getMin=0.0, getStartValue=100.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<sample:9>", "<sample:3>", "30.000000000000004", "2.0", "-1.0"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=8, getMin=30.000000000000004, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:5>", "<sample:7>", "-6.119000000000001", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=-6.119000000000001, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:5>", "<sample:5>", "9.999999999999998", "-1.9999999999999998", "0.10095000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10095000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.9999999999999998, getMaxEvaluations=!NullPointerException, getMin=9.999999999999998, getStartValue=0.10095000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"53", "<sample:0>", "<sample:8>", "5.000000000000001", "1.0"}, false, 2, new String[][]{}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=53, getMin=5.000000000000001, getStartValue=3.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:6>", "0.5160000000000001", "2.4815", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.4815, getMaxEvaluations=!NullPointerException, getMin=0.5160000000000001, getStartValue=-0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-106", "<sample:12>", "<sample:2>", "-4.9E-324", "Infinity", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=-4.9E-324, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2097195", "<sample:13>", "<sample:6>", "2.0190000000000006", "1.0", "1.0684999999999998"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=2097195, getMin=2.0190000000000006, getStartValue=1.0684999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1997", "<sample:0>", "<sample:4>", "2.0189999999999997", "-0.49999999999999994"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.7594999999999998, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.49999999999999994, getMaxEvaluations=1997, getMin=2.0189999999999997, getStartValue=0.7594999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2049", "<sample:0>", "<sample:3>", "1.0", "-0.5"}, false, 7, new String[][]{}), new String[][]{{"getPoint", "", "2"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.5, getMaxEvaluations=2049, getMin=1.0, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"4", "<sample:12>", "<sample:1>", "-9.999999999999998", "0.07999999999999996", "1.7976931348623155E308"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.7976931348623155E308, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.07999999999999996, getMaxEvaluations=4, getMin=-9.999999999999998, getStartValue=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"11", "<sample:13>", "<sample:7>", "-16.999999999999996", "10.000000000000002"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=10.000000000000002, getMaxEvaluations=11, getMin=-16.999999999999996, getStartValue=-3.4999999999999964}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<null>", "<sample:2>", "2.0190000000000006", "3.0000000000000004", "0.0"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "55", "<sample:3>", "<sample:6>", "0.10095000000000001", "9.999999999999998", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=9.999999999999998, getMaxEvaluations=55, getMin=0.10095000000000001, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:2>", "<sample:1>", "0.0516", "20.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=20.0, getMaxEvaluations=!NullPointerException, getMin=0.0516, getStartValue=10.0258}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4147", "<sample:12>", "<sample:0>", "100.0", "0.5000000000000001"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=50.25, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5000000000000001, getMaxEvaluations=4147, getMin=100.0, getStartValue=50.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"14", "<sample:14>", "<sample:5>", "0.30000000000000004", "0.5160000000000001", "-4.9E-324"}, false, 7, new String[][]{}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.5160000000000001, getMaxEvaluations=14, getMin=0.30000000000000004, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-11", "<sample:13>", "<sample:0>", "10.0", "1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "90", "<sample:7>", "<sample:9>", "-1.7976931348623155E308", "1.0095000000000003"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E307, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=1.0095000000000003, getMaxEvaluations=90, getMin=-1.7976931348623155E308, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"131116", "<sample:5>", "<sample:0>", "50.0", "-0.66095", "-1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.66095, getMaxEvaluations=131116, getMin=50.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-16", "<sample:2>", "<sample:0>", "1.7976931348623157E308", "4.038"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=4.038, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-60", "<sample:5>", "<sample:5>", "4.0", "4.870000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.4350000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=4.870000000000001, getMaxEvaluations=!NullPointerException, getMin=4.0, getStartValue=4.4350000000000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "12", "<sample:4>", "<sample:2>", "1.4999999999999998", "0.20189999999999997", "-1.0095000000000003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20189999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.20189999999999997, getMaxEvaluations=!NullPointerException, getMin=1.4999999999999998, getStartValue=-1.0095000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2049", "<sample:2>", "<sample:2>", "3.000000000000001", "-1.7976931348623155E308", "9.926"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=3.000000000000001, getStartValue=9.926}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:2>", "10.000000000000004", "-2.019"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.9905000000000017, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-2.019, getMaxEvaluations=2147483647, getMin=10.000000000000004, getStartValue=3.9905000000000017}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "55", "<sample:1>", "<sample:4>", "1.0", "2.17"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.585", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.17, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=1.585}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-51", "<sample:11>", "<sample:2>", "2.0569999999999995", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=2.0569999999999995, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:7>", "<sample:1>", "1.0095", "5.000000000000001"}, false, 7, new String[][]{}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=5.000000000000001, getMaxEvaluations=2147483647, getMin=1.0095, getStartValue=3.0047500000000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:8>", "<sample:4>", "6.32", "1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=2, getMin=6.32, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:14>", "<sample:6>", "10.0", "20.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=20.0, getMaxEvaluations=!NullPointerException, getMin=10.0, getStartValue=15.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "17", "<sample:4>", "<sample:6>", "Infinity", "-0.09999999999999999", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.09999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-0.09999999999999999, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"112", "<sample:11>", "<sample:3>", "1.0095000000000003", "0.3", "-1.0"}, false, 7, new String[][]{}, 1), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.3, getMaxEvaluations=112, getMin=1.0095000000000003, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:1>", "<sample:5>", "-0.0", "9.0", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-Infinity, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=9.0, getMaxEvaluations=2, getMin=-0.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"4", "<sample:14>", "<sample:3>", "20.0", "0.20569999999999994", "1.0"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.20569999999999994, getMaxEvaluations=4, getMin=20.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"15", "<sample:9>", "<sample:4>", "9.8", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4098", "<null>", "<null>", "2.0000000000000004", "-15.000000000000002", "-1.6400000000000001"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=5.4, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=15, getMin=9.8, getStartValue=5.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<sample:4>", "<sample:0>", "5.0475", "0.258", "1.7976931348623155E308"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.258, getMaxEvaluations=8, getMin=5.0475, getStartValue=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.000000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"26", "<sample:2>", "<null>", "-4.9E-324", "-1.0095000000000003", "NaN"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "58", "<sample:4>", "<sample:1>", "-1.7976931348623157E308", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=58, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"13", "<sample:14>", "<sample:2>", "1.7976931348623157E308", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=8.988465674311579E307, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=13, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:2>", "<sample:9>", "-4.9E-324", "-0.0"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.0, getMaxEvaluations=2, getMin=-4.9E-324, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:11>", "<sample:1>", "1.0", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=0, getMin=1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "51", "<sample:12>", "<sample:10>", "Infinity", "0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.25, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:7>", "<sample:2>", "2.9815", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.9815", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=2.9815, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"65", "<null>", "<null>", "-4.9E-324", "2.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-4.9E-324"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "10.095"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483625", "<sample:13>", "<sample:6>", "9.400000000000002", "5.000000000000002", "8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.000000000000002, getMaxEvaluations=2147483625, getMin=9.400000000000002, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8", "<sample:5>", "<sample:3>", "0.5", "-0.75", "1.0095"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-0.75, getMaxEvaluations=8, getMin=0.5, getStartValue=1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:7>", "<sample:8>", "-1.0095", "-8.98846567431158E307", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-8.98846567431158E307, getMaxEvaluations=-2147483648, getMin=-1.0095, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"50", "<sample:6>", "<null>", "5.000000000000001", "-4.9E-324", "1.7976931348623157E308"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"64", "<sample:14>", "<sample:0>", "1.7976931348623157E308", "0.5160000000000002", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5160000000000002, getMaxEvaluations=64, getMin=1.7976931348623157E308, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-106", "<sample:5>", "<sample:0>", "-1.5", "-3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-106", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-3.0, getMaxEvaluations=-106, getMin=-1.5, getStartValue=-2.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2049", "<sample:9>", "<sample:2>", "4.914000000000001", "0.0516"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.4828", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0516, getMaxEvaluations=2049, getMin=4.914000000000001, getStartValue=2.4828}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:0>", "<sample:3>", "9.957", "0.0516"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.004300000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.0516, getMaxEvaluations=1, getMin=9.957, getStartValue=5.004300000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "37", "<sample:1>", "<sample:3>", "1.0", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"44", "<sample:5>", "<sample:6>", "2.019", "4.114"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.0665, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=4.114, getMaxEvaluations=44, getMin=2.019, getStartValue=3.0665}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:11>", "<sample:5>", "-1.7976931348623157E308", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-2.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483635", "<sample:13>", "<sample:7>", "4.9E-324", "10.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=5.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=10.0, getMaxEvaluations=2147483635, getMin=4.9E-324, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"51", "<sample:7>", "<sample:3>", "1.0", "-7.286000000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-3.1430000000000007, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-7.286000000000001, getMaxEvaluations=51, getMin=1.0, getStartValue=-3.1430000000000007}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:10>", "<sample:4>", "2.021999999999999", "-1.7976931348623157E308", "1.0095"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=0, getMin=2.021999999999999, getStartValue=1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:0>", "<sample:2>", "-1.0094999999999998", "3.9999999999999996"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.4952499999999997, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.9999999999999996, getMaxEvaluations=2147483647, getMin=-1.0094999999999998, getStartValue=1.4952499999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:1>", "<sample:2>", "0.20569999999999994", "2.0189999999999997"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1123499999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0189999999999997, getMaxEvaluations=!NullPointerException, getMin=0.20569999999999994, getStartValue=1.1123499999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-0.43999999999999995"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6146", "<sample:1>", "<sample:2>", "-1.5000000000000002", "1.7976931348623155E308", "10.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=10.0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.7976931348623155E308, getMaxEvaluations=6146, getMin=-1.5000000000000002, getStartValue=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:1>", "<sample:0>", "1.967", "0.516"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:2>", "<sample:9>", "0.9964000000000001", "10.0"}}, 1), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2415", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.516, getMaxEvaluations=42, getMin=1.967, getStartValue=1.2415}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2019", "<sample:8>", "<sample:4>", "Infinity", "-57.0", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-57.0, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"10.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:13>", "<sample:7>", "2.999999999999999", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=4, getMin=2.999999999999999, getStartValue=1.4999999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483586", "<sample:4>", "<sample:5>", "4.0", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=4.0, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:7>", "<sample:7>", "8.988465674311578E307", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.3482698511467367E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=8.988465674311578E307, getStartValue=1.3482698511467367E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:7>", "1.7976931348623155E308", "0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623155E308, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "-0.0", "-2.019"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0095, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-2.019, getMaxEvaluations=2147483647, getMin=-0.0, getStartValue=-1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"83", "<sample:14>", "<sample:9>", "-1.5169999999999997", "-3.6905"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-2.60375, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.6905, getMaxEvaluations=83, getMin=-1.5169999999999997, getStartValue=-2.60375}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:6>", "<sample:6>", "5.0", "-7.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-7.5, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=-1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:10>", "<sample:4>", "-10.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-53", "<sample:13>", "<sample:3>", "10.0", "0.516"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.516", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.516, getMaxEvaluations=!NullPointerException, getMin=10.0, getStartValue=5.258}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:10>", "<sample:1>", "1.7976931348623155E308", "-0.9999999999999999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623155E308, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:4>", "<sample:8>", "-1.449", "0.9999999999999999", "10.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.449", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.9999999999999999, getMaxEvaluations=!NullPointerException, getMin=-1.449, getStartValue=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.10999999999999997"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "27", "<sample:1>", "<sample:2>", "2.0189999999999997", "2.019", "-1.9999999999999998"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=2.019, getMaxEvaluations=27, getMin=2.0189999999999997, getStartValue=-1.9999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:12>", "<sample:3>", "0.5", "2.0000000000000004", "-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0000000000000004, getMaxEvaluations=2, getMin=0.5, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"12", "<sample:8>", "<sample:3>", "1.6190000000000002", "1.0095", "-1.0094999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0094999999999998, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0095, getMaxEvaluations=12, getMin=1.6190000000000002, getStartValue=-1.0094999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-0.7499999999999999"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:13>", "<sample:4>", "-1.5", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=3, getMin=-1.5, getStartValue=-0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:7>", "<sample:1>", "2.019", "-1.9999999999999998", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.9999999999999998, getMaxEvaluations=!NullPointerException, getMin=2.019, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.9999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:13>", "<sample:7>", "-3.0", "-3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-3.0, getMaxEvaluations=2, getMin=-3.0, getStartValue=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:4>", "<sample:6>", "5.253", "10.000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.626500000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=10.000000000000002, getMaxEvaluations=!NullPointerException, getMin=5.253, getStartValue=7.626500000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-35", "<sample:1>", "<sample:0>", "2.019", "1.5", "-1.0095"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=!NullPointerException, getMin=2.019, getStartValue=-1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "102", "<sample:6>", "<sample:9>", "NaN", "-1.7976931348623158E307", "2.019"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=103, getGoalType=MINIMIZE, getMax=-1.7976931348623158E307, getMaxEvaluations=102, getMin=NaN, getStartValue=2.019}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:14>", "<sample:4>", "-2.019", "-4.9E-323"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-323", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-4.9E-323, getMaxEvaluations=!NullPointerException, getMin=-2.019, getStartValue=-1.0095}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:1>", "<sample:0>", "1.7976931348623153E308", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.5160000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623153E308, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-118", "<sample:1>", "<sample:9>", "-1.9999999999999998", "0.038", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.038", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.038, getMaxEvaluations=-118, getMin=-1.9999999999999998, getStartValue=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2097155", "<sample:9>", "<sample:6>", "-7.000000000000001", "Infinity", "0.9999999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=-7.000000000000001, getStartValue=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-268435354", "<sample:5>", "<sample:5>", "0.4963", "-1.7976931348623157E308", "-30.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-30.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=-268435354, getMin=0.4963, getStartValue=-30.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:6>", "<sample:1>", "0.3", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=-2147483648, getMin=0.3, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4098", "<sample:2>", "<sample:3>", "-0.50475", "9.999999999999998"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=9.999999999999998, getMaxEvaluations=4098, getMin=-0.50475, getStartValue=4.747624999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "34", "<sample:14>", "<sample:5>", "2.0569999999999995", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.5, getMaxEvaluations=34, getMin=2.0569999999999995, getStartValue=1.7784999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1", "<sample:14>", "<sample:3>", "NaN", "2.0189999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0189999999999997, getMaxEvaluations=-1, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:7>", "<sample:10>", "2.019", "2.913999999999999", "3.719"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.019", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.913999999999999, getMaxEvaluations=2147483647, getMin=2.019, getStartValue=3.719}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "7", "<sample:4>", "<sample:2>", "-6.0095", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.0095", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=7, getMin=-6.0095, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:7>", "<sample:6>", "4.9E-323", "Infinity", "-3.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=-1, getMin=4.9E-323, getStartValue=-3.6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1011", "<sample:4>", "<sample:5>", "-3.0000000000000004", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=-3.0000000000000004, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:8>", "-5.0", "1.7976931348623157E308", "-1.7976931348623153E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=-5.0, getStartValue=-1.7976931348623153E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:1>", "<sample:10>", "-1.7976931348623157E308", "10.000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=10.000000000000002, getMaxEvaluations=2147483647, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "55", "<sample:13>", "<sample:6>", "Infinity", "-0.34"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-0.34, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1028", "<sample:12>", "<sample:0>", "-1.7976931348623157E308", "-0.050475000000000006", "-16.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.050475000000000006, getMaxEvaluations=1028, getMin=-1.7976931348623157E308, getStartValue=-16.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:11>", "<sample:9>", "-2.0569999999999995", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=6, getMin=-2.0569999999999995, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "27", "<sample:12>", "<sample:8>", "-3.4800000000000004", "-10.000000000000002", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-10.000000000000002, getMaxEvaluations=27, getMin=-3.4800000000000004, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:9>", "49.629999999999995", "5.160000000000001"}}), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("27.395", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=5.160000000000001, getMaxEvaluations=2147483647, getMin=49.629999999999995, getStartValue=27.395}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:0>", "<sample:0>", "1.7976931348623157E308", "2.019"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.019, getMaxEvaluations=3, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "22", "<sample:5>", "<sample:2>", "-0.9999999999999999", "1.0", "1.7976931348623157E308"}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=22, getMin=-0.9999999999999999, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:14>", "<sample:2>", "1.7976931348623153E308", "46.516"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311577E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=46.516, getMaxEvaluations=2147483647, getMin=1.7976931348623153E308, getStartValue=8.988465674311577E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:3>", "<sample:0>", "-Infinity", "-6.0", "4.9E-324"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-6.0, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:1>", "<sample:8>", "1.025", "1.7976931348623153E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623153E308, getMaxEvaluations=!NullPointerException, getMin=1.025, getStartValue=8.988465674311577E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2000", "<sample:12>", "<sample:5>", "-Infinity", "1.4999999999999998", "2.9600000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2001, getGoalType=MINIMIZE, getMax=1.4999999999999998, getMaxEvaluations=2000, getMin=-Infinity, getStartValue=2.9600000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:4>", "<sample:1>", "3.0", "-0.9999999999999999", "-4.9E-324"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-4.9E-324, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=5, getMin=3.0, getStartValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4192", "<sample:4>", "<sample:1>", "10.325", "-1.0", "-0.33"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=4192, getMin=10.325, getStartValue=-0.33}", SearchInputFactory_scaffolding.receiverState());
 }
}
