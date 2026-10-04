package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=-1.7976931348623157E308, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:6>", "<sample:0>", "NaN", "3.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "275", "<sample:6>", "<sample:8>", "0.0", "1.7976931348623157E308", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.15500000000000003"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:7>", "<sample:8>", "Infinity", "2.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "19", "<sample:4>", "<sample:5>", "-Infinity", "NaN", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:0>", "<sample:4>", "1.5", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=6, getMin=1.5, getStartValue=3.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-32.208999999999996"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "16450", "<sample:6>", "<sample:0>", "-Infinity", "1.0", "0.011080000000000003"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "58", "<sample:6>", "<sample:6>", "-1.25", "0.0", "-0.030000000000000027"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=58, getMin=-1.25, getStartValue=-0.030000000000000027}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:4>", "-1.0", "-1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<null>", "<sample:3>", "5.0", "0.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<null>", "<sample:3>", "5.0", "0.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<null>", "<sample:3>", "5.0", "0.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "3.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "3.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=10, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:1>", "<sample:4>", "0.5", "NaN", "3.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:1>", "0.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:1>", "0.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=2147483647, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:0>", "<null>", "Infinity", "Infinity", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:0>", "<null>", "Infinity", "Infinity", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:0>", "<null>", "Infinity", "Infinity", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1", "<sample:7>", "<sample:1>", "1.0", "0.5", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:7>", "-1.7976931348623157E308", "1.7976931348623157E308", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=-1.7976931348623157E308, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:2>", "<sample:4>", "-1.7976931348623157E308", "0.29999999999999993"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<null>", "<sample:4>", "-1.7976931348623157E308", "0.29999999999999993"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-3", "<sample:6>", "<sample:3>", "-4.9E-324", "Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:2>", "<sample:4>", "5.0", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=10, getMin=5.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:3>", "1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:3>", "1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=5, getMin=1.7976931348623157E308, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:2>", "<sample:4>", "2.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:2>", "<sample:4>", "2.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=6, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-6", "<sample:2>", "<sample:4>", "2.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=-6, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-16384", "<sample:4>", "<sample:1>", "1.7976931348623157E308", "NaN", "3.0"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-16384", "<sample:4>", "<null>", "1.7976931348623157E308", "NaN", "3.0"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483610", "<sample:4>", "<null>", "8.98846567431158E307", "NaN", "NaN"}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:7>", "<sample:5>", "NaN", "NaN", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:3>", "<sample:7>", "5.0", "2.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:5>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=10, getMin=1.7976931348623157E308, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:3>", "<sample:7>", "5.0", "2.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:5>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:2>", "<sample:7>", "5.0", "2.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:5>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:6>", "<sample:6>", "5.0", "3.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:2>", "<sample:7>", "5.0", "2.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:5>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:6>", "<sample:6>", "5.0", "0.3", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.3, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:4>", "5.0", "0.0", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:4>", "0.0", "2.0", "1.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:4>", "0.0", "2.0", "0.15"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:4>", "-1.0", "-1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=5, getMin=-1.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:5>", "-1.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:4>", "-1.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<null>", "<sample:3>", "5.0", "0.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "3.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=10, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "1.5", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=10, getMin=1.5, getStartValue=1.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "1.5", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=1.5, getStartValue=1.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:6>", "3.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:2>", "Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:3>", "<sample:7>", "1.0", "Infinity", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:1>", "<sample:4>", "0.5", "NaN", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:4>", "<sample:2>", "-1.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=1, getMin=-1.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:0>", "<sample:1>", "0.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:7>", "-1.0", "5.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:7>", "<sample:4>", "5.0", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=4, getMin=5.0, getStartValue=3.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:7>", "<sample:4>", "5.0", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=3.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1", "<null>", "<sample:1>", "-1.0", "0.5", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:7>", "<sample:5>", "NaN", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:5>", "5.0", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:2>", "<sample:4>", "0.5", "1.5", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=6, getMin=0.5, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:6>", "3.0", "NaN", "5.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:1>", "<sample:2>", "0.5", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=1, getMin=0.5, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:1>", "<sample:2>", "0.5", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=1, getMin=0.5, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:6>", "<sample:4>", "3.0", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:3>", "1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=5, getMin=1.7976931348623157E308, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:7>", "<sample:0>", "-1.7976931348623157E308", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:7>", "<sample:0>", "2.0", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:7>", "<sample:0>", "2.0", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=5, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:0>", "3.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:2>", "<sample:7>", "5.0", "3.0", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:5>", "1.7976931348623157E308", "NaN", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=10, getMin=1.7976931348623157E308, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}, {"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:2>", "<sample:6>", "0.0", "2.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=6, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:3>", "<sample:6>", "Infinity", "1.5", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:4>", "0.0", "2.0", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:3>", "<sample:0>", "2.0", "1.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=10, getMin=2.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:0>", "<null>", "1.0", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4", "<sample:0>", "<sample:1>", "5.0", "1.0"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=4, getMin=5.0, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4", "<sample:0>", "<sample:0>", "10.0", "1.0"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=5.5, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=4, getMin=10.0, getStartValue=5.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:1>", "2.0", "1.7976931348623157E308", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:7>", "0.0", "5.0", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "<null>", "8.000000000000002", "-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:2>", "<sample:5>", "3.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=1, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:2>", "<sample:5>", "0.3", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=1, getMin=0.3, getStartValue=1.15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:6>", "<sample:7>", "0.5", "-1.0", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-89.481"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:0>", "<sample:1>", "-1.7976931348623157E308", "3.0", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:4>", "<sample:3>", "3.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:4>", "2.0", "2.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=2147483647, getMin=2.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:4>", "2.0", "2.0", "5.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=2147483647, getMin=2.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:1>", "-1.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4", "<sample:3>", "<sample:1>", "-1.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:0>", "1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:0>", "1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:5>", "<sample:6>", "1.7976931348623157E308", "1.7976931348623157E308", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:0>", "1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:3>", "<sample:6>", "-1.0", "-1.0", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=3, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:3>", "<sample:6>", "-1.0", "-1.0", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=3, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:8>", "<sample:6>", "-1.0", "-1.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=3, getMin=-1.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:8>", "<sample:6>", "-1.0", "-1.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=3, getMin=-1.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:6>", "-1.0", "-1.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:7>", "-1.0", "-1.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "0"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:7>", "-1.011", "-1.0", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "0"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=-1.011, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:7>", "-1.011", "-0.9999999999999999", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "0"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=2147483647, getMin=-1.011, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:4>", "-1.011", "-0.9999999999999999", "1.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}), new String[][]{{"getPoint", "", "0"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=2147483647, getMin=-1.011, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:1>", "<sample:3>", "Infinity", "-1.0"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:1>", "<sample:0>", "2.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=6, getMin=2.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "8", "<sample:1>", "<sample:0>", "2.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=8, getMin=2.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "8", "<sample:1>", "<sample:0>", "1.81", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=8, getMin=1.81, getStartValue=1.405}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "8", "<sample:1>", "<sample:0>", "18.1", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=8, getMin=18.1, getStartValue=9.55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "8", "<sample:1>", "<sample:0>", "18.1", "35.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=35.0, getMaxEvaluations=8, getMin=18.1, getStartValue=26.55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:2>", "<sample:5>", "Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=10, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"10", "<null>", "<sample:6>", "1.5", "3.0000000000000004"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:6>", "<sample:6>", "NaN", "5.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=-2147483648, getMin=NaN, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:6>", "<sample:6>", "NaN", "5.0", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=-2147483648, getMin=NaN, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:6>", "<sample:6>", "NaN", "5.0", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:2>", "<sample:4>", "1.7976931348623158E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.7976931348623158E307, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:2>", "<sample:3>", "1.7976931348623158E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.7976931348623158E307, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:3>", "<sample:4>", "1.7976931348623155E307", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.7976931348623155E307, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:3>", "<sample:4>", "1.7976931348623158E307", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.7976931348623158E307, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:3>", "-1.7976931348623157E308", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:3>", "-1.7976931348623157E308", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=4, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:3>", "-1.7976931348623157E308", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:3>", "-1.7976931348623157E308", "10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=10.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:4>", "<sample:0>", "5.0", "5.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1", "<sample:0>", "<sample:6>", "0.5", "1.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=-1, getMin=0.5, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:2>", "<sample:3>", "0.0", "0.5", "-1.5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:2>", "<sample:0>", "4.548", "0.5", "1.5"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.5, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=5, getMin=4.548, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "<sample:0>", "4.548", "0.5", "1.5"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.5, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2147483647, getMin=4.548, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "<sample:0>", "0.4548", "0.5", "1.5"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.5, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.4548, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "<sample:0>", "0.4548", "0.5", "1.5"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.5, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2147483647, getMin=0.4548, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:2>", "<sample:4>", "3.0", "NaN", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:2>", "<sample:4>", "3.0", "NaN", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:3>", "-1.0000000000000002", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.220446049250313E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=1, getMin=-1.0000000000000002, getStartValue=-2.220446049250313E-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:3>", "-1.0", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=1, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:7>", "<sample:7>", "2.0", "0.0", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=-2147483648, getMin=2.0, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:7>", "<sample:7>", "2.0", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:5>", "<sample:1>", "2.0", "0.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=3, getMin=2.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:4>", "-1.0", "0.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:1>", "<sample:3>", "1.5", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311579E307, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=4, getMin=1.5, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:0>", "<sample:1>", "0.5", "2.0", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=-2147483648, getMin=0.5, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:7>", "<sample:1>", "1.5", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=1.5, getStartValue=1.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:7>", "<sample:4>", "1.5", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:6>", "<sample:3>", "0.5", "1.5", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}, {"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.5, getMaxEvaluations=10, getMin=0.5, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<null>", "<sample:4>", "Infinity", "5.0", "1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<null>", "<sample:6>", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:7>", "2.0", "5.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=3.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:3>", "<sample:3>", "Infinity", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:6>", "<sample:6>", "-1.7976931348623157E308", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.495"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:7>", "<sample:1>", "0.5", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:4>", "<sample:5>", "3.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:2>", "<sample:5>", "2.0", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:2>", "<sample:5>", "2.0", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=5, getMin=2.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:2>", "<sample:5>", "2.0", "1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.5, getMaxEvaluations=5, getMin=2.0, getStartValue=1.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:3>", "<sample:3>", "-1.5", "NaN"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:7>", "<sample:5>", "1.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=0, getMin=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:7>", "<sample:5>", "1.0", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=0, getMin=1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:0>", "<sample:4>", "1.0", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311579E307, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=2, getMin=1.0, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:0>", "<sample:4>", "1.0", "5.0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=2, getMin=1.0, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:0>", "<sample:4>", "1.0", "0.5"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.75, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2, getMin=1.0, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"43", "<sample:0>", "<sample:4>", "1.0", "0.5"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.75, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=43, getMin=1.0, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"43", "<sample:0>", "<sample:3>", "1.0", "0.5"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.75, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.5, getMaxEvaluations=43, getMin=1.0, getStartValue=0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"43", "<sample:0>", "<sample:3>", "1.0", "1.0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=43, getMin=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:0>", "<sample:3>", "1.0", "1.0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=21, getMin=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:0>", "<sample:3>", "1.0", "1.0"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=21, getMin=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:0>", "<sample:3>", "1.007", "1.0"}, false, 2, new String[][]{}, 1), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0034999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=21, getMin=1.007, getStartValue=1.0034999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:3>", "<sample:6>", "0.5", "2.5"}, false, 2, new String[][]{}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.5, getMaxEvaluations=21, getMin=0.5, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:2>", "<sample:7>", "1.03", "2.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "0"}, {"getValue", "", "1"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.5, getMaxEvaluations=21, getMin=1.03, getStartValue=1.7650000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:2>", "<sample:7>", "1.0299999999999998", "2.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "0"}, {"getValue", "", "1"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.5, getMaxEvaluations=21, getMin=1.0299999999999998, getStartValue=1.765}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:2>", "<sample:6>", "1.0299999999999998", "2.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getPoint", "", "5"}, {"getPoint", "", "0"}, {"getValue", "", "1"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.5, getMaxEvaluations=21, getMin=1.0299999999999998, getStartValue=1.765}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:1>", "<sample:4>", "1.5", "1.7976931348623157E308", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=1, getMin=1.5, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:7>", "<null>", "Infinity", "-1.7976931348623157E308", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:5>", "<sample:4>", "Infinity", "0.0", "3.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:3>", "0.0", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:1>", "<sample:2>", "-0.5000000000000001", "-1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-0.75, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=3, getMin=-0.5000000000000001, getStartValue=-0.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:8>", "<sample:0>", "-0.4800000000000001", "0.5"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.009999999999999953", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=3, getMin=-0.4800000000000001, getStartValue=0.009999999999999953}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:8>", "<sample:5>", "0.0", "-5.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-5.0, getMaxEvaluations=2, getMin=0.0, getStartValue=-2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"140", "<sample:10>", "<sample:2>", "Infinity", "5.120000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"12", "<sample:4>", "<sample:0>", "Infinity", "-9.999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:2>", "-1.7976931348623157E308", "-19.195"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:6>", "<null>", "1.0", "0.0"}}, 3), new String[][]{{"getValue", "", "1"}, {"getValue", "", "0"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-19.195, getMaxEvaluations=6, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:7>", "-1.7976931348623157E308", "-19.195"}, false, 7, new String[][]{}, 3), new String[][]{{"getValue", "", "1"}, {"getValue", "", "0"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-19.195, getMaxEvaluations=6, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"44", "<sample:6>", "<sample:2>", "1.0", "-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:1>", "<sample:1>", "0.5", "NaN"}}, 3), new String[][]{{"getPoint", "", "7"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=44, getMin=1.0, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"105", "<sample:4>", "<sample:1>", "1.0", "1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.0, getMaxEvaluations=105, getMin=1.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:5>", "<sample:5>", "NaN", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:6>", "<sample:0>", "-1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=-2147483648, getMin=-1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:4>", "<sample:7>", "5.0", "1.7976931348623157E308", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:4>", "<sample:7>", "5.0", "1.7976931348623157E308", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:4>", "<sample:7>", "5.0", "1.7976931348623157E308", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=5.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:7>", "<sample:5>", "-1.0", "Infinity", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-4.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-4.4942328371557893E307"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"53.772"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:1>", "<sample:0>", "1.5", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=10, getMin=1.5, getStartValue=1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:6>", "<sample:0>", "1.0", "-0.0", "-1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.0000000000000002, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=1.0, getStartValue=-1.0000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:6>", "<sample:0>", "1.0", "-0.0", "-1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=1.0, getStartValue=-1.0000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:6>", "<sample:0>", "1.0", "-0.0", "29.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("29.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=1.0, getStartValue=29.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:6>", "<sample:0>", "1.0", "-0.0", "29.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:0>", "<sample:7>", "-1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=1.0, getStartValue=29.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:2>", "<sample:2>", "1.0", "-0.0", "29.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:0>", "<sample:7>", "-1.7976931348623157E308", "1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=1.0, getStartValue=29.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:2>", "<sample:2>", "0.2", "-0.0", "29.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:0>", "<sample:7>", "-1.7976931348623157E308", "1.0", "0.25"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741823, getMin=0.2, getStartValue=29.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741878", "<sample:2>", "<sample:2>", "0.2", "-0.0", "29.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:0>", "<sample:7>", "-1.7976931348623157E308", "1.0", "0.25"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-0.0, getMaxEvaluations=1073741878, getMin=0.2, getStartValue=29.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:2>", "<sample:1>", "-0.2", "-0.0", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("290.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.0, getMaxEvaluations=2147483647, getMin=-0.2, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:0>", "<sample:1>", "-0.2", "-19.0", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("290.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-19.0, getMaxEvaluations=2147483647, getMin=-0.2, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:1>", "0.2", "-19.0", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("290.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-19.0, getMaxEvaluations=2147483647, getMin=0.2, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:1>", "0.2", "-38.0", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("290.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-38.0, getMaxEvaluations=2147483647, getMin=0.2, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:1>", "0.4", "-43.2", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("290.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-43.2, getMaxEvaluations=2147483647, getMin=0.4, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:1>", "0.4", "-43.2", "290.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"getPoint", "", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-43.2, getMaxEvaluations=2147483647, getMin=0.4, getStartValue=290.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:3>", "<sample:3>", "1.0", "-1.0", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:0>", "<sample:1>", "NaN", "NaN", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=2, getMin=NaN, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:0>", "<sample:1>", "NaN", "NaN", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:6>", "1.5", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=1.5, getStartValue=0.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:4>", "2.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=2.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:3>", "2.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=2.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:4>", "2.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=2.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:4>", "-2.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=2147483647, getMin=-2.0, getStartValue=-1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:3>", "<sample:6>", "5.0", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.5, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=3.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "29", "<sample:6>", "<sample:6>", "-24.0", "15.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=15.0, getMaxEvaluations=!NullPointerException, getMin=-24.0, getStartValue=-4.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "29", "<sample:6>", "<sample:7>", "-24.0", "15.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=15.0, getMaxEvaluations=!NullPointerException, getMin=-24.0, getStartValue=-4.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "29", "<sample:6>", "<sample:7>", "-24.0", "7.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=7.5, getMaxEvaluations=!NullPointerException, getMin=-24.0, getStartValue=-8.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "29", "<sample:6>", "<sample:7>", "-24.0", "7.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=7.5, getMaxEvaluations=29, getMin=-24.0, getStartValue=-8.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "29", "<sample:6>", "<sample:2>", "-12.0", "7.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=7.5, getMaxEvaluations=29, getMin=-12.0, getStartValue=-2.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:5>", "<sample:0>", "3.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:1>", "<sample:2>", "NaN", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:0>", "<sample:3>", "NaN", "Infinity", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:4>", "<sample:1>", "0.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.5, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=5.0, getMaxEvaluations=5, getMin=0.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:1>", "<sample:4>", "1.0", "1.0", "1.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=10, getMin=1.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
}
