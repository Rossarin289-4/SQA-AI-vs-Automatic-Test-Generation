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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:1>", "<sample:7>", "2.0", "2.0"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:4>", "-1.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:2>", "3.0", "Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=3.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:8>", "<sample:2>", "0.01566", "Infinity", "1.7976931348623158E307"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:7>", "<sample:2>", "44.5", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2, getMin=44.5, getStartValue=22.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"3", "<sample:0>", "<sample:6>", "NaN", "1.7976931348623157E308", "21.7"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:8>", "<sample:0>", "-5.24", "-64999.99999999999", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:5>", "<sample:4>", "NaN", "-65.0", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-65.0, getMaxEvaluations=2147483647, getMin=NaN, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:1>", "<sample:9>", "-1.7976931348623157E308", "8.988465674311578E306", "217.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=8.988465674311578E306, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getStartValue=217.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:4>", "<sample:9>", "-1.7976931348623157E308", "8.988465674311576E306", "-2170.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=49, getGoalType=MINIMIZE, getMax=8.988465674311576E306, getMaxEvaluations=48, getMin=-1.7976931348623157E308, getStartValue=-2170.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:5>", "<sample:2>", "-1.7976931348623157E308", "2.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=10, getMin=-1.7976931348623157E308, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:1>", "<sample:6>", "-1.9000000000000004", "1.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=-1, getMin=-1.9000000000000004, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"12", "<sample:4>", "<sample:0>", "0.33999999999999997", "11.5", "-1.9000000000000004"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.9000000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.9000000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:5>", "<sample:6>", "-1.0", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2147483648", "<sample:6>", "<sample:3>", "2.0", "3.0"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2147483648", "<null>", "<sample:3>", "2.0", "2.9999999999999996"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:5>", "<sample:4>", "22.999999999999996", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:2>", "-0.4", "30.259999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:0>", "<sample:4>", "22.999999999999996", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=30.259999999999998, getMaxEvaluations=2147483647, getMin=-0.4, getStartValue=14.929999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:2>", "-0.4", "30.259999999999998"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:0>", "<sample:4>", "22.999999999999996", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:2>", "1.0", "30.259999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:0>", "<sample:4>", "22.999999999999996", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=30.259999999999998, getMaxEvaluations=2147483647, getMin=1.0, getStartValue=15.629999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "1.0", "30.259999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:0>", "<sample:4>", "22.999999999999996", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=30.259999999999998, getMaxEvaluations=2147483647, getMin=1.0, getStartValue=15.629999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "1.0", "30.259999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("15.629999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=30.259999999999998, getMaxEvaluations=2147483647, getMin=1.0, getStartValue=15.629999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "1.0", "60.519999999999996"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-0.1"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("30.759999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=60.519999999999996, getMaxEvaluations=2147483647, getMin=1.0, getStartValue=30.759999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "1.0", "121.03999999999999"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-0.1"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.7976931348623157E308"}}, 1), new String[][]{{"getPoint", "", "5"}, {"getValue", "", "7"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("61.019999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=121.03999999999999, getMaxEvaluations=2147483647, getMin=1.0, getStartValue=61.019999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:6>", "<sample:6>", "3.0", "3.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:6>", "<sample:6>", "3.0", "3.0", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=0, getMin=3.0, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:4>", "<sample:0>", "-1.7976931348623157E308", "1.0", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"134217728", "<sample:1>", "<sample:0>", "0.0", "2.0", "5.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=134217728, getMin=0.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"134217728", "<sample:1>", "<sample:0>", "0.0", "4.0", "4.999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=4.0, getMaxEvaluations=134217728, getMin=0.0, getStartValue=4.999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"134217728", "<sample:1>", "<null>", "0.0", "2.0", "4.999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:1>", "<sample:0>", "0.0", "4.0", "4.999999999999999"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:4>", "<sample:8>", "-1.9000000000000004", "-1.9000000000000004", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=3, getMin=-1.9000000000000004, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:4>", "<sample:8>", "-1.9000000000000004", "-1.9000000000000004", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=!NullPointerException, getMin=-1.9000000000000004, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<null>", "-1.9000000000000004", "1.0", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-100.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"0", "<sample:0>", "<sample:3>", "-1.0", "1.7976931348623157E308", "5.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"9", "<null>", "<sample:6>", "6.0", "1.7976931348623157E308", "-20.000000000000004"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:6>", "<sample:6>", "23.0", "-1.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-36", "<sample:1>", "<sample:4>", "-2.9999999999999996", "-Infinity", "-10.000000000000004"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:6>", "<sample:6>", "230.0", "-1.03", "0.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-3.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"12", "<sample:3>", "<sample:0>", "1.7976931348623158E307", "NaN", "1.0"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:6>", "-10.0", "0.0", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=-10.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:6>", "45.0", "0.0", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=45.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:7>", "<sample:9>", "-65.0", "-1.546", "NaN"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:6>", "<sample:1>", "-64999.99999999999", "-3.092", "NaN"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:1>", "<sample:7>", "-1.9000000000000004", "23.0"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:0>", "<sample:6>", "-1.9000000000000004", "-1.9000000000000004", "23.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=!NullPointerException, getMin=-1.9000000000000004, getStartValue=23.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:0>", "<sample:8>", "-1.9000000000000004", "-1.9000000000000004", "23.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=6, getMin=-1.9000000000000004, getStartValue=23.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:3>", "<sample:1>", "0.5", "0.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:0>", "<sample:8>", "-1.9000000000000004", "-1.9000000000000004", "23.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=6, getMin=-1.9000000000000004, getStartValue=23.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:7>", "<null>", "1.7976931348623157E308", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:3>", "<sample:1>", "0.5", "0.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:8>", "-1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:5>", "-1.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:5>", "-1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:5>", "-1.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:2>", "3.0", "Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:4>", "-10.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:2>", "<sample:4>", "3.0", "Infinity", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=3.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:4>", "-10.0", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:5>", "-10.0", "-1.9000000000000004", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=5, getMin=-10.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:5>", "-10.0", "-1.9000000000000004", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=!NullPointerException, getMin=-10.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:7>", "-1.0", "-2.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-1.5, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-2.0, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=-1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:1>", "<sample:8>", "1.7976931348623157E308", "1.7976931348623157E308", "2.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:5>", "-1.0", "-2.0"}, false, 7, new String[][]{}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-2.0, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=-1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2147483647", "<sample:5>", "<sample:5>", "-1.0", "-2.0"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:5>", "-0.5", "-2.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-2.0, getMaxEvaluations=2147483647, getMin=-0.5, getStartValue=-1.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:4>", "<sample:7>", "0.0", "23.0", "-1.9000000000000004"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=23.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=-1.9000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:4>", "<sample:7>", "0.0", "23.0", "-1.9000000000000004"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=23.0, getMaxEvaluations=1, getMin=0.0, getStartValue=-1.9000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:0>", "<sample:7>", "0.0", "-23.0", "-1.9000000000000004"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-23.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=-1.9000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:0>", "<sample:7>", "0.0", "-23.0", "-1.9000000000000004"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-23.0, getMaxEvaluations=1, getMin=0.0, getStartValue=-1.9000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:4>", "0.5", "-10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:6>", "<sample:3>", "2.0", "3.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:7>", "<sample:3>", "NaN", "0.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:6>", "<sample:6>", "3.7", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-0.9500000000000002, getValue=-3.2025630761017476}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=3.7, getStartValue=-0.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:6>", "<sample:6>", "3.7", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.2025630761017476", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=3.7, getStartValue=-0.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:6>", "<sample:6>", "8.120000000000001", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.2025630761017476", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=8.120000000000001, getStartValue=-0.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:5>", "<sample:6>", "8.120000000000001", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-0.9500000000000002, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=2, getMin=8.120000000000001, getStartValue=-0.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:5>", "<sample:6>", "8.120000000000001", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=8.120000000000001, getStartValue=-0.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-5", "<sample:5>", "<sample:6>", "8.120000000000001", "0.0", "-0.9500000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:5>", "<sample:5>", "8.120000000000001", "0.0", "-0.3700000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=5, getMin=8.120000000000001, getStartValue=-0.3700000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:5>", "<sample:5>", "8.120000000000001", "-1.0", "-0.1850000000000001"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=5, getMin=8.120000000000001, getStartValue=-0.1850000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:5>", "<sample:7>", "8.120000000000001", "-1.0", "-0.1850000000000001"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.7976931348623155E308"}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1850000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=2, getMin=8.120000000000001, getStartValue=-0.1850000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:5>", "<sample:7>", "8.120000000000001", "-0.5", "-0.3700000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "23.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:2>", "<sample:6>", "1.7976931348623157E308", "0.5", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.7976931348623157E308"}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.3700000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.5, getMaxEvaluations=2, getMin=8.120000000000001, getStartValue=-0.3700000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:0>", "<sample:7>", "4.060000000000001", "-0.5", "-0.7400000000000004"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:2>", "<sample:6>", "1.7976931348623157E308", "0.5", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7400000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.5, getMaxEvaluations=2147483647, getMin=4.060000000000001, getStartValue=-0.7400000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:8>", "3.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=10, getMin=3.0, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "10", "<sample:5>", "<sample:8>", "-3.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=10, getMin=-3.0, getStartValue=-2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:5>", "<sample:8>", "-3.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=1, getMin=-3.0, getStartValue=-2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:4>", "<sample:8>", "-1.9000000000000004", "-1.9000000000000004", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=!NullPointerException, getMin=-1.9000000000000004, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:2>", "<sample:2>", "23.0", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=23.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:2>", "<sample:2>", "23.0", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=2, getMin=23.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.1"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.1"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "23.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:6>", "<sample:7>", "-1.0", "1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1", "<sample:6>", "<sample:7>", "-1.0", "1.7976931348623157E308", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=-1, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:6>", "-10.0", "0.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:6>", "-10.0", "0.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=-10.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1", "<sample:4>", "<sample:0>", "26005.82", "3.092", "-1.1440000000000003"}, false, 12, new String[][]{}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1440000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.092, getMaxEvaluations=1, getMin=26005.82, getStartValue=-1.1440000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"60", "<sample:2>", "<sample:6>", "-15.906", "4.83", "-66.4"}, false, 2, new String[][]{}, 1), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=4.83, getMaxEvaluations=60, getMin=-15.906, getStartValue=-66.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"60", "<sample:2>", "<sample:5>", "-15.906", "4.83", "-66.4"}, false, 2, new String[][]{}, 1), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.83, getMaxEvaluations=60, getMin=-15.906, getStartValue=-66.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"60", "<sample:2>", "<sample:6>", "-15.906", "-13.17", "-66.4"}, false, 2, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-13.17, getMaxEvaluations=60, getMin=-15.906, getStartValue=-66.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"60", "<sample:1>", "<sample:0>", "-15.906", "-13.17", "-10.037"}, false, 2, new String[][]{}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-13.17, getMaxEvaluations=60, getMin=-15.906, getStartValue=-10.037}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:9>", "5.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:7>", "<sample:2>", "23.0", "2.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:1>", "2.0", "Infinity", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=4, getMin=2.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:2>", "<sample:4>", "2.056", "Infinity", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=4, getMin=2.056, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:2>", "<sample:4>", "2.056", "Infinity", "1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=2.056, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:2>", "<sample:4>", "2.056", "Infinity", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=4, getMin=2.056, getStartValue=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:2>", "<sample:4>", "2.056", "Infinity", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=2.056, getStartValue=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:1>", "<sample:4>", "2.056", "-65.0", "1.7976931348623155E308"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-65.0, getMaxEvaluations=4, getMin=2.056, getStartValue=1.7976931348623155E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:0>", "<sample:8>", "-3.092", "-10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:6>", "<sample:9>", "-1.7976931348623157E308", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8194", "<sample:1>", "<sample:4>", "2.0300000000000002", "NaN", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8195, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=8194, getMin=2.0300000000000002, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:6>", "<sample:9>", "-1.7976931348623157E308", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8194", "<sample:1>", "<sample:4>", "2.0300000000000002", "NaN", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=2.0300000000000002, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:6>", "<sample:9>", "-1.7976931348623157E308", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.092, getMaxEvaluations=4, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:11>", "-1.7976931348623157E308", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8194", "<sample:1>", "<sample:9>", "Infinity", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8195, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=8194, getMin=Infinity, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:11>", "-1.7976931348623157E308", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8194", "<sample:1>", "<sample:9>", "Infinity", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:7>", "<sample:11>", "-1.7976931348623157E308", "-65.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8194", "<sample:7>", "<sample:9>", "Infinity", "NaN", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8195, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=8194, getMin=Infinity, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:5>", "<sample:1>", "3.0", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:0>", "<sample:3>", "1.0", "-10.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-10.0, getMaxEvaluations=10, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:0>", "<sample:3>", "1.0", "-10.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-10.0, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:0>", "<sample:4>", "1.0", "-10.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-10.0, getMaxEvaluations=10, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:0>", "<sample:8>", "0.5", "-10.0", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-10.0, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:7>", "<sample:2>", "1.0", "-1.546", "-65.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.546, getMaxEvaluations=!NullPointerException, getMin=1.0, getStartValue=-65.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1", "<sample:2>", "<sample:8>", "5.0", "-3.8000000000000007"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:6>", "-10.0", "-1.9000000000000004", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:6>", "-10.0", "-1.9000000000000004", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:0>", "-10.0", "-1.9000000000000004", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=Infinity, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:0>", "-10.0", "-1.9000000000000004", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:0>", "-10.0", "-1.9000000000000004", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}), new String[][]{{"getValue", "", "2"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:0>", "-10.0", "-1.9000000000000004", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.6"}}), new String[][]{{"getValue", "", "2"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:0>", "-10.0", "-1.9000000000000004", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}), new String[][]{{"getValue", "", "2"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=4, getMin=-10.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:0>", "<sample:3>", "-64999.99999999999", "-1.546"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.546, getMaxEvaluations=!NullPointerException, getMin=-64999.99999999999, getStartValue=-32500.772999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:0>", "<sample:3>", "-64999.99999999999", "-1.546"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.546, getMaxEvaluations=2, getMin=-64999.99999999999, getStartValue=-32500.772999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:0>", "<sample:3>", "-64999.99999999999", "-1.546"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.546, getMaxEvaluations=!NullPointerException, getMin=-64999.99999999999, getStartValue=-32500.772999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:1>", "<sample:2>", "5.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.546"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=!NullPointerException, getMin=5.0, getStartValue=2.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:8>", "<sample:0>", "1.7976931348623157E308", "-1.546"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.546, getMaxEvaluations=1, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:8>", "<sample:0>", "1.7976931348623157E308", "-27.546"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-27.546, getMaxEvaluations=1, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:0>", "1.7976931348623157E308", "-27.546"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-27.546, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:8>", "<sample:5>", "1.7976931348623157E308", "-27.546"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:4>", "<sample:5>", "3.0", "0.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-27.546, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:7>", "-1.546", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2270000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=-1.546, getStartValue=0.2270000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:7>", "-1.546", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2270000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=-1.546, getStartValue=0.2270000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:7>", "<sample:7>", "-1.546", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2270000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=2147483647, getMin=-1.546, getStartValue=0.2270000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:2>", "<sample:2>", "-3.092", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=-3.092, getStartValue=-2.0460000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:5>", "0.0", "3.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=5, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:5>", "0.0", "3.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:7>", "<sample:3>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=3, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:7>", "<sample:3>", "NaN", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4122", "<sample:10>", "<sample:9>", "5.75", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:4>", "<sample:1>", "5.0", "0.5", "-3.092"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:4>", "<sample:2>", "2.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:4>", "<sample:2>", "4.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=4.0, getStartValue=3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"57", "<sample:0>", "<sample:7>", "-1.9000000000000004", "-3.092", "-9.999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0000000000000004"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-9.999999999999998, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.092, getMaxEvaluations=57, getMin=-1.9000000000000004, getStartValue=-9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"4153", "<sample:0>", "<sample:7>", "-1.9000000000000004", "-3.092", "-9.999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-9.999999999999998, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.092, getMaxEvaluations=4153, getMin=-1.9000000000000004, getStartValue=-9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:4>", "<sample:2>", "-65.0", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=!NullPointerException, getMin=-65.0, getStartValue=-32.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:4>", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:3>", "<sample:4>", "-1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:3>", "<sample:4>", "-1.9000000000000004", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.4500000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=-1.9000000000000004, getStartValue=-1.4500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "46.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:2>", "-65.0", "-1.0", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=4, getMin=-65.0, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "46.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:2>", "-65.00000000000001", "-1.0", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=4, getMin=-65.00000000000001, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "46.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:2>", "-6.500000000000002", "-1.0", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=4, getMin=-6.500000000000002, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "46.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-4", "<sample:0>", "<sample:2>", "-65.00000000000001", "-1.0", "-10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=-4, getMin=-65.00000000000001, getStartValue=-10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1", "<sample:4>", "<sample:0>", "1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=-1, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1", "<sample:4>", "<sample:0>", "1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "7", "<sample:4>", "<sample:3>", "1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.0, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:3>", "<sample:1>", "-1.0", "-1.9000000000000004", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=!NullPointerException, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:3>", "<sample:1>", "-1.0", "-1.9000000000000004", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.9000000000000004, getMaxEvaluations=0, getMin=-1.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:9>", "<sample:6>", "-65.0", "-10.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:1>", "<sample:2>", "-1.7976931348623157E308", "-3.092"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-10.0, getMaxEvaluations=6, getMin=-65.0, getStartValue=-37.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:8>", "-65.0", "-10.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:1>", "<sample:2>", "-1.7976931348623157E308", "-3.092"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-10.0, getMaxEvaluations=6, getMin=-65.0, getStartValue=-37.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:6>", "<sample:9>", "-65.0", "-10.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-10.0, getMaxEvaluations=6, getMin=-65.0, getStartValue=-37.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:4>", "<sample:6>", "-1.9000000000000004", "3.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=!NullPointerException, getMin=-1.9000000000000004, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:0>", "<sample:1>", "-130.42", "-1.25"}, false, 2, new String[][]{}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.835", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.25, getMaxEvaluations=3, getMin=-130.42, getStartValue=-65.835}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:0>", "<sample:1>", "-130.41999999999996", "-1.25"}, false, 2, new String[][]{}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.83499999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.25, getMaxEvaluations=3, getMin=-130.41999999999996, getStartValue=-65.83499999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:0>", "<sample:1>", "-130.41999999999996", "-0.125"}, false, 2, new String[][]{}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.27249999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.125, getMaxEvaluations=3, getMin=-130.41999999999996, getStartValue=-65.27249999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:0>", "<sample:1>", "-1304.1999999999996", "-0.125"}, false, 2, new String[][]{}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-652.1624999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.125, getMaxEvaluations=3, getMin=-1304.1999999999996, getStartValue=-652.1624999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:0>", "<null>", "-1304.1999999999996", "-0.125"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:1>", "<sample:0>", "5.0", "23.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:6>", "-64999.99999999999", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=-64999.99999999999, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:1>", "<sample:0>", "5.0", "23.0", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:1>", "<sample:6>", "-64999.99999999999", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=5, getMin=-64999.99999999999, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:1>", "<sample:0>", "5.0", "20.9", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "12", "<sample:0>", "<sample:6>", "-64999.99999999999", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=12, getMin=-64999.99999999999, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "11", "<sample:0>", "<sample:6>", "-64999.99999999999", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=11, getMin=-64999.99999999999, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:2>", "<sample:0>", "Infinity", "2.0", "2.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "11", "<sample:0>", "<sample:6>", "-64999.99999999999", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=11, getMin=-64999.99999999999, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "11", "<sample:0>", "<sample:6>", "-64999.99999999999", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=11, getMin=-64999.99999999999, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-11", "<sample:0>", "<sample:9>", "-64999.99999999999", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=-11, getMin=-64999.99999999999, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "11", "<sample:0>", "<sample:9>", "-64999.99999999999", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=11, getMin=-64999.99999999999, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:0>", "<sample:9>", "-64999.99999999999", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=-64999.99999999999, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:2>", "<sample:1>", "-1.7976931348623157E308", "23.0", "1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("23.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=23.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:6>", "<sample:8>", "-3.092", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=50, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=48, getMin=-3.092, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:6>", "<sample:8>", "-3.092", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=50, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=48, getMin=-3.092, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:6>", "<sample:8>", "-3.092", "Infinity", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=49, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=48, getMin=-3.092, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:6>", "<sample:8>", "-6.184", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=49, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=48, getMin=-6.184, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2", "<sample:1>", "<null>", "1.0", "1.0", "23.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:6>", "<sample:7>", "-1.9260000000000002", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=27, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=26, getMin=-1.9260000000000002, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:6>", "<sample:6>", "-1.9260000000000002", "Infinity", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=27, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=26, getMin=-1.9260000000000002, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:6>", "<sample:6>", "-1.9260000000000002", "Infinity", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=27, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=26, getMin=-1.9260000000000002, getStartValue=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:6>", "<sample:6>", "-1.9260000000000002", "Infinity", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=-1.9260000000000002, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "1.9260000000000002", "Infinity", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.9260000000000002, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "23.0", "Infinity", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=23.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-27", "<sample:8>", "<sample:4>", "1.9260000000000002", "Infinity", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=-27, getMin=1.9260000000000002, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "1.9260000000000002", "Infinity", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.9260000000000002, getStartValue=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "1.5660000000000003", "Infinity", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=1.5660000000000003, getStartValue=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "0.15660000000000002", "Infinity", "8.988465674311579E306"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=0.15660000000000002, getStartValue=8.988465674311579E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:4>", "<sample:8>", "-1.9260000000000002", "0.0", "-64999.99999999999"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=10, getMin=-1.9260000000000002, getStartValue=-64999.99999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:4>", "<sample:8>", "-1.9260000000000002", "0.0", "-64999.99999999999"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "0.15660000000000002", "Infinity", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=5, getMin=0.15660000000000002, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:8>", "<sample:3>", "0.01566", "Infinity", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=10, getMin=0.01566, getStartValue=1.7976931348623158E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:8>", "<sample:2>", "0.01566", "Infinity", "1.7976931348623158E307"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:8>", "<sample:2>", "0.5", "5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=4, getMin=0.5, getStartValue=2.75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:4>", "0.5", "-65.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-65.0, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=-32.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:2>", "0.5", "-65.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-65.0, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=-32.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:2>", "0.5", "-65.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-65.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-65.0, getMaxEvaluations=2, getMin=0.5, getStartValue=-32.25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:4>", "<sample:1>", "NaN", "NaN", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:1>", "-3.092", "NaN", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=5, getMin=-3.092, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:1>", "-3.092", "NaN", "-5.24"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=5, getMin=-3.092, getStartValue=-5.24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:5>", "<sample:1>", "-3.092", "NaN", "-5.24"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-3.092, getStartValue=-5.24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:5>", "<sample:1>", "-3.092", "NaN", "-5.24"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=1, getMin=-3.092, getStartValue=-5.24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:2>", "<sample:3>", "0.0", "-5.3", "-3.092"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-5.3, getMaxEvaluations=48, getMin=0.0, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:2>", "<sample:3>", "0.0", "-10.6", "-3.092"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-10.6, getMaxEvaluations=48, getMin=0.0, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "48", "<sample:2>", "<sample:4>", "0.0", "-5.3", "-3.092"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-5.3, getMaxEvaluations=48, getMin=0.0, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:1>", "<sample:2>", "0.0", "-5.3", "-3.092"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-5.3, getMaxEvaluations=2147483647, getMin=0.0, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:1>", "<sample:4>", "0.019", "5.3", "-10.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "69", "<sample:8>", "<sample:3>", "-Infinity", "-1.546"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=70, getGoalType=MINIMIZE, getMax=-1.546, getMaxEvaluations=69, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.9260000000000002"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.3265000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:5>", "<sample:1>", "23.0", "-10.0", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-10.0, getMaxEvaluations=26, getMin=23.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.3265000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:5>", "<sample:1>", "23.0", "-5.0", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-5.0, getMaxEvaluations=26, getMin=23.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.3265000000000002"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "26", "<sample:5>", "<sample:1>", "23.0", "-5.0", "0.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-5.0, getMaxEvaluations=26, getMin=23.0, getStartValue=0.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:3>", "<sample:0>", "-3.092", "NaN", "-3.092"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=-3.092, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:3>", "<sample:0>", "-3.092", "NaN", "-3.092"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.092", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=3, getMin=-3.092, getStartValue=-3.092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:0>", "<sample:5>", "-10.0", "2.0", "-1.9260000000000002"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=1, getMin=-10.0, getStartValue=-1.9260000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:6>", "<sample:4>", "-1.546", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.727", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=-1.546, getStartValue=1.727}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:1>", "<sample:7>", "1.0", "1.7976931348623157E308", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=5.0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=6, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:4>", "<sample:1>", "1.0", "1.7976931348623158E307", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623158E307, getMaxEvaluations=6, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:5>", "<sample:8>", "1.0", "3.5953862697246315E307", "5.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.5953862697246315E307, getMaxEvaluations=6, getMin=1.0, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "5.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"10", "<sample:2>", "<sample:5>", "1.0", "4.9E-324", "1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.7976931348623157E308, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=10, getMin=1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"10", "<sample:2>", "<sample:5>", "1.0", "4.9E-324", "1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=10, getMin=1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:2>", "<sample:7>", "1.0", "4.9E-324", "1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=5, getMin=1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:1>", "<sample:7>", "1.0", "4.9E-324", "1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=5, getMin=1.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"10", "<sample:1>", "<sample:7>", "-3.092", "4.9E-324", "1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=10, getMin=-3.092, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
