package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:4>", "<sample:7>", "1.0", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=6, getMin=1.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:2>", "<sample:4>", "1.7976931348623157E308", "-1.7976931348623157E308", "-25.061"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getStartValue=-25.061}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "83", "<sample:4>", "<sample:4>", "Infinity", "-3.402", "-8.988465674311578E306"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:0>", "<sample:7>", "NaN", "-1.7976931348623155E308", "67.99999999999999"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=67.99999999999999, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=5, getMin=NaN, getStartValue=67.99999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "40", "<sample:6>", "<sample:5>", "-25.061", "-Infinity", "67.99999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=41, getGoalType=MINIMIZE, getMax=-Infinity, getMaxEvaluations=40, getMin=-25.061, getStartValue=67.99999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:3>", "<sample:4>", "0.5", "34.0", "3.046"}, false, 2, new String[][]{}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.046", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=34.0, getMaxEvaluations=2147483647, getMin=0.5, getStartValue=3.046}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"83", "<sample:8>", "<sample:3>", "-3.402", "3.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:7>", "<sample:2>", "-0.9", "-Infinity"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<null>", "<sample:2>", "-8.988465674311578E306", "6.0", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"3", "<sample:1>", "<sample:6>", "-8.988465674311578E307", "0.0"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.9390000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-1", "<null>", "<sample:1>", "-0.5", "-1.7976931348623155E307", "-1.7976931348623155E307"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-2147483648", "<sample:6>", "<sample:2>", "10.0", "-0.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-1073741824", "<sample:10>", "<sample:4>", "Infinity", "0.5000000000000001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.5000000000000001, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-61", "<sample:4>", "<null>", "-1.7976931348623157E308", "2.85"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:3>", "<sample:1>", "-1.0", "30.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=30.0, getMaxEvaluations=1, getMin=-1.0, getStartValue=14.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.46950000000000003"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"0", "<sample:2>", "<sample:3>", "3.4", "10.0", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:3>", "<sample:0>", "NaN", "-1.7976931348623157E308", "0.9390000000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=0.9390000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2", "<sample:3>", "<sample:7>", "-3.4000000000000004", "3.4000000000000004"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1073741823", "<sample:1>", "<sample:1>", "-8.988465674311578E306", "-2.0", "0.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-3", "<sample:7>", "<sample:1>", "-3.0", "Infinity", "-0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=Infinity, getMaxEvaluations=!NullPointerException, getMin=-3.0, getStartValue=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"134217681", "<sample:6>", "<sample:6>", "-1.7976931348623155E307", "2.0", "-0.49999999999999994"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1547005383792515", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=134217681, getMin=-1.7976931348623155E307, getStartValue=-0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:2>", "<sample:3>", "-4.494232837155789E307", "-0.9999999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=6, getMin=-4.494232837155789E307, getStartValue=-2.2471164185778944E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-4", "<sample:7>", "<sample:0>", "8.988465674311579E307", "1.0", "18.646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=-4, getMin=8.988465674311579E307, getStartValue=18.646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:12>", "<sample:2>", "3.0459999999999994", "-4.494232837155789E306", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-4.494232837155789E306, getMaxEvaluations=!NullPointerException, getMin=3.0459999999999994, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<null>", "<sample:0>", "NaN", "-0.1", "9.5"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0459999999999994"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "10", "<sample:8>", "<sample:7>", "11.0", "-1.7976931348623157E308", "0.15"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=!NullPointerException, getMin=11.0, getStartValue=0.15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"9", "<sample:4>", "<sample:8>", "0.9390000000000001", "2.2", "-9.999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-9.999999999999998, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.2, getMaxEvaluations=9, getMin=0.9390000000000001, getStartValue=-9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"14", "<sample:1>", "<sample:5>", "0.0", "4.0", "-25.061000000000003"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:9>", "<sample:4>", "-Infinity", "-Infinity"}}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-25.061000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.0, getMaxEvaluations=14, getMin=0.0, getStartValue=-25.061000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:5>", "<sample:7>", "2.0", "Infinity", "-1.0159999999999998"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-6.804"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:8>", "<sample:2>", "-1.0", "-3.595386269724631E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}}, 1), new String[][]{{"getValue", "", "5"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623155E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-3.595386269724631E307, getMaxEvaluations=42, getMin=-1.0, getStartValue=-1.7976931348623155E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"42", "<sample:2>", "<sample:10>", "0.7614999999999998", "1.7976931348623155E307", "3.0000000000000004"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.0459999999999994"}}, 2), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623155E307, getMaxEvaluations=42, getMin=0.7614999999999998, getStartValue=3.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:6>", "<sample:9>", "-1.7976931348623157E308", "-1.7976931348623157E308", "-44.1"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "6.939"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-44.1, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=2, getMin=-1.7976931348623157E308, getStartValue=-44.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:2>", "<sample:3>", "3.0019999999999993", "-1.1000000000000003"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.1000000000000003, getMaxEvaluations=2147483647, getMin=3.0019999999999993, getStartValue=0.9509999999999996}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"10", "<sample:2>", "<sample:2>", "NaN", "0.9560000000000001", "-13.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:3>", "<sample:2>", "1.7976931348623157E308", "3.0459999999999994", "Infinity"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 1), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.0459999999999994, getMaxEvaluations=2, getMin=1.7976931348623157E308, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "67108878", "<sample:1>", "<sample:0>", "-1.7976931348623158E307", "-12.5305"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-12.5305, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623158E307, getStartValue=-8.988465674311579E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-166", "<sample:3>", "<sample:4>", "3.0", "1.0", "-2.059"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=!NullPointerException, getMin=3.0, getStartValue=-2.059}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-2147483648", "<sample:6>", "<null>", "1.7976931348623157E308", "-5.0"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "73", "<sample:4>", "<sample:7>", "-0.05", "-8.988465674311578E306"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.494232837155789E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=73, getMin=-0.05, getStartValue=-4.494232837155789E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:3>", "<sample:2>", "3.0", "1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:4>", "<sample:8>", "1.7976931348623157E308", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-4.9E-324, getMaxEvaluations=!NullPointerException, getMin=1.7976931348623157E308, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"-206", "<sample:5>", "<sample:10>", "Infinity", "-3.4000000000000004", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-9", "<sample:2>", "<null>", "4.9E-324", "2.4999999999999996"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "8", "<sample:1>", "<sample:0>", "-1.7976931348623157E308", "0.9390000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.9390000000000001, getMaxEvaluations=8, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.9390000000000001"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:3>", "<sample:0>", "Infinity", "2.9999999999999996"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.9999999999999996, getMaxEvaluations=!NullPointerException, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1028", "<sample:0>", "<sample:9>", "-3.0000000000000004", "-3.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-3.0, getMaxEvaluations=!NullPointerException, getMin=-3.0000000000000004, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"134217756", "<sample:0>", "<sample:3>", "5.0", "-1.7976931348623155E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E307, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=134217756, getMin=5.0, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-5", "<sample:7>", "<null>", "NaN", "1.7976931348623157E308", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:3>", "<sample:7>", "-1.0", "18.78"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=18.78, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=8.89}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:4>", "<sample:4>", "-1.7976931348623155E308", "84.0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E307, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=84.0, getMaxEvaluations=5, getMin=-1.7976931348623155E308, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<null>", "<sample:7>", "5.003", "-0.5", "-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:2>", "<sample:6>", "0.0", "-4.2", "0.9999999999999999"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "5", "<sample:6>", "<sample:6>", "6.0", "29.6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=29.6, getMaxEvaluations=!NullPointerException, getMin=6.0, getStartValue=17.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2", "<sample:4>", "<sample:4>", "1.7976931348623155E308", "10.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=10.0, getMaxEvaluations=-2, getMin=1.7976931348623155E308, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-8", "<sample:10>", "<sample:10>", "8.988465674311579E307", "-1.7976931348623155E308", "5.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=8.988465674311579E307, getStartValue=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:7>", "<sample:5>", "-1.7976931348623155E308", "-9.987", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-9.987, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623155E308, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"3.4000000000000004"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:0>", "<sample:0>", "-1.7976931348623155E308", "-1.7976931348623155E307", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"4", "<sample:7>", "<sample:1>", "0.0", "0.6"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.3, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.6, getMaxEvaluations=4, getMin=0.0, getStartValue=0.3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:0>", "<sample:2>", "-9.600000000000001", "2.0000000000000004", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=2.0000000000000004, getMaxEvaluations=6, getMin=-9.600000000000001, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-10", "<sample:7>", "<sample:5>", "-5.0", "4.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=4.0, getMaxEvaluations=!NullPointerException, getMin=-5.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:1>", "<sample:0>", "Infinity", "-1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:8>", "<sample:2>", "3.0459999999999994", "1.7976931348623157E308", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:3>", "<sample:0>", "-0.1", "-1.7976931348623155E307", "3.045999999999999"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E307, getMaxEvaluations=2, getMin=-0.1, getStartValue=3.045999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-10", "<sample:1>", "<sample:0>", "NaN", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=10.0, getMaxEvaluations=!NullPointerException, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-33", "<sample:2>", "<sample:7>", "3.4000000000000004", "3.400000000000001", "NaN"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.400000000000001, getMaxEvaluations=-33, getMin=3.4000000000000004, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "56", "<sample:2>", "<null>", "0.09390000000000001", "3.4000000000000004", "-5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:5>", "<sample:5>", "1.029", "-8.988465674311578E306"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.494232837155789E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=!NullPointerException, getMin=1.029, getStartValue=-4.494232837155789E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:0>", "<sample:1>", "-8.988465674311578E307", "-3.0459999999999994", "-6.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-6.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-3.0459999999999994, getMaxEvaluations=2147483647, getMin=-8.988465674311578E307, getStartValue=-6.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:7>", "<sample:5>", "0.0", "-0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:3>", "<sample:4>", "0.992", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "5"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.0, getMaxEvaluations=1, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2", "<sample:9>", "<sample:2>", "-2.0", "9.39"}, false, 7, new String[][]{}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=9.39, getMaxEvaluations=2, getMin=-2.0, getStartValue=3.6950000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"10", "<sample:6>", "<sample:5>", "3.4000000000000004", "-0.9999999999999999"}, false, 7, new String[][]{}), new String[][]{{"getValue", "", "7"}, {"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=10, getMin=3.4000000000000004, getStartValue=1.2000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:2>", "<sample:4>", "-0.49999999999999994", "-0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.29999999999999993", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-0.09999999999999999, getMaxEvaluations=!NullPointerException, getMin=-0.49999999999999994, getStartValue=-0.29999999999999993}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:7>", "<sample:4>", "Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=-2147483648, getMin=Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "46", "<sample:5>", "<sample:4>", "-1.7976931348623157E308", "2.0", "-3.400000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623157E308, getStartValue=-3.400000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:8>", "<sample:5>", "0.47", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.5, getMaxEvaluations=!NullPointerException, getMin=0.47, getStartValue=0.485}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"1", "<sample:7>", "<sample:4>", "1.7000000000000002", "5.0", "30.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=1, getMin=1.7000000000000002, getStartValue=30.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:5>", "<sample:6>", "Infinity", "0.0", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=-2147483648, getMin=Infinity, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"10", "<sample:3>", "<sample:0>", "41.4", "3.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("22.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=10, getMin=41.4, getStartValue=22.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:5>", "<sample:6>", "5.0", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=0, getMin=5.0, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:5>", "<sample:4>", "0.46950000000000003", "-0.9999999999999998", "-3.0459999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-0.9999999999999998, getMaxEvaluations=!NullPointerException, getMin=0.46950000000000003, getStartValue=-3.0459999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"0", "<sample:5>", "<sample:4>", "0.5", "-Infinity", "-5.000000000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<sample:1>", "<sample:3>", "-45.0", "0.05", "0.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.5, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.05, getMaxEvaluations=8, getMin=-45.0, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:6>", "<sample:6>", "-1.7976931348623155E307", "3.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:7>", "<sample:7>", "0.23475000000000001", "0.0", "44.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=-2147483648, getMin=0.23475000000000001, getStartValue=44.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:5>", "<sample:5>", "0.3045999999999999", "3.046", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "35", "<sample:8>", "<sample:4>", "-0.49999999999999994", "-1.7976931348623155E308", "NaN"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.046, getMaxEvaluations=2147483647, getMin=0.3045999999999999, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:0>", "<sample:9>", "-1.0", "2.0000000000000004", "1.5229999999999997"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.0000000000000004, getMaxEvaluations=2, getMin=-1.0, getStartValue=1.5229999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2080374783", "<sample:0>", "<sample:7>", "-Infinity", "2.75"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=2.75, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "16", "<sample:5>", "<sample:4>", "0.9390000000000001", "0.49999999999999994"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=0.49999999999999994, getMaxEvaluations=!NullPointerException, getMin=0.9390000000000001, getStartValue=0.7195}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-134217810", "<sample:4>", "<sample:3>", "2.5", "-1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217810", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623158E307, getMaxEvaluations=-134217810, getMin=2.5, getStartValue=-8.988465674311579E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "4", "<sample:0>", "<sample:1>", "0.0", "-1.7976931348623155E308", "0.8420000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.8420000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "134217786", "<sample:2>", "<sample:1>", "-Infinity", "0.1", "1.516"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.1, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=1.516}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1", "<sample:3>", "<sample:7>", "0.5", "-0.9999999999999999", "0.9700000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=!NullPointerException, getMin=0.5, getStartValue=0.9700000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"134250524", "<sample:7>", "<sample:2>", "0.527", "1.7976931348623157E308", "0.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.5, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=134250524, getMin=0.527, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:5>", "<sample:2>", "1.7976931348623157E308", "0.2", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.2, getMaxEvaluations=6, getMin=1.7976931348623157E308, getStartValue=10.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "6", "<sample:10>", "<sample:2>", "0.0", "-Infinity", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:6>", "<sample:0>", "10.0", "12.0", "2.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}), new String[][]{{"getValue", "", "2"}, {"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=12.0, getMaxEvaluations=2, getMin=10.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8", "<sample:3>", "<sample:4>", "0.0", "-1.7976931348623155E307", "3.0459999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0459999999999994", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E307, getMaxEvaluations=8, getMin=0.0, getStartValue=3.0459999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:0>", "<sample:3>", "0.4695000000000001", "-1.7976931348623153E307", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-1.7976931348623153E307, getMaxEvaluations=!NullPointerException, getMin=0.4695000000000001, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "-1.9999999999999998", "0.5", "Infinity"}, false, 2, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2147483647, getMin=-1.9999999999999998, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "1.8780000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:2>", "<sample:1>", "-2.6000000000000005", "-2.9999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.9999999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-2.9999999999999996, getMaxEvaluations=!NullPointerException, getMin=-2.6000000000000005, getStartValue=-2.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:10>", "<sample:8>", "1.7976931348623157E308", "0.2", "-0.49999999999999994"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-0.49999999999999994, getValue=-1.1547005383792515}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.2, getMaxEvaluations=2147483647, getMin=1.7976931348623157E308, getStartValue=-0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:2>", "<sample:7>", "3.0", "3.0", "-0.992"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.0, getMaxEvaluations=2, getMin=3.0, getStartValue=-0.992}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:0>", "<sample:2>", "-0.05", "-1.7976931348623155E307"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E306, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E307, getMaxEvaluations=1, getMin=-0.05, getStartValue=-8.988465674311578E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:0>", "<sample:1>", "NaN", "0.0", "-8.988465674311578E306"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:0>", "<sample:0>", "3.4000000000000004", "0.5", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getMax=0.5, getMaxEvaluations=2, getMin=3.4000000000000004, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1073741823", "<sample:7>", "<sample:4>", "6.091999999999999", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.091999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=2.0, getMaxEvaluations=!NullPointerException, getMin=6.091999999999999, getStartValue=4.045999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-134217729", "<sample:6>", "<sample:9>", "-1.7976931348623155E307", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623155E307, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:8>", "<sample:5>", "-Infinity", "-0.9999999999999999", "-5.300000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.300000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=0, getMin=-Infinity, getStartValue=-5.300000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "3", "<sample:6>", "<sample:4>", "NaN", "1.0", "1.1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2147483648", "<sample:2>", "<sample:6>", "2.5", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=NaN, getMaxEvaluations=-2147483648, getMin=2.5, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:1>", "<sample:9>", "-Infinity", "-3.595386269724631E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:5>", "<sample:1>", "Infinity", "34.0", "-Infinity"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:7>", "<sample:1>", "0.5", "34.02"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}), new String[][]{{"getValue", "", "7"}, {"getPoint", "", "0"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=34.02, getMaxEvaluations=5, getMin=0.5, getStartValue=17.26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"42", "<sample:3>", "<sample:7>", "-1.7976931348623157E308", "6.0", "1.9500000000000002"}, false, 2, new String[][]{}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=6.0, getMaxEvaluations=42, getMin=-1.7976931348623157E308, getStartValue=1.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "156", "<sample:5>", "<sample:6>", "0.5", "-Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=157, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=156, getMin=0.5, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"33", "<sample:1>", "<sample:7>", "-3.595386269724631E307", "-1.7976931348623155E307"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-2.6965397022934733E307, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623155E307, getMaxEvaluations=33, getMin=-3.595386269724631E307, getStartValue=-2.6965397022934733E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:1>", "<sample:0>", "680.0", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=340.0, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=6, getMin=680.0, getStartValue=340.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "-0.49999999999999994", "-3.5953862697246305E307"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-3.5953862697246305E307, getMaxEvaluations=2147483647, getMin=-0.49999999999999994, getStartValue=-1.7976931348623153E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "0", "<sample:5>", "<sample:1>", "-Infinity", "4.9E-324", "0.9390000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=4.9E-324, getMaxEvaluations=0, getMin=-Infinity, getStartValue=0.9390000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-21", "<sample:4>", "<sample:4>", "-12.5305", "-29.954", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-29.954, getMaxEvaluations=-21, getMin=-12.5305, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "134217756", "<sample:6>", "<sample:9>", "0.09390000000000001", "-0.9999999999999998"}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.45304999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-0.9999999999999998, getMaxEvaluations=134217756, getMin=0.09390000000000001, getStartValue=-0.45304999999999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "37", "<sample:11>", "<sample:6>", "-Infinity", "Infinity", "6.804"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=37, getMin=-Infinity, getStartValue=6.804}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:8>", "<sample:2>", "NaN", "5.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=3, getMin=NaN, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:10>", "<sample:4>", "40.5", "0.7400000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("40.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.7400000000000001, getMaxEvaluations=2, getMin=40.5, getStartValue=20.62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:4>", "<sample:3>", "0.4999999999999999", "1.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.1, getMaxEvaluations=2147483647, getMin=0.4999999999999999, getStartValue=0.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-35", "<sample:7>", "<sample:3>", "67.99999999999999", "-3.4019999999999997"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-35", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.4019999999999997, getMaxEvaluations=-35, getMin=67.99999999999999, getStartValue=32.29899999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "134217756", "<sample:8>", "<sample:4>", "6.800000000000001", "-6.091999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.800000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-6.091999999999999, getMaxEvaluations=134217756, getMin=6.800000000000001, getStartValue=0.354000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:4>", "<sample:9>", "-Infinity", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=3, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"33554465", "<sample:5>", "<sample:0>", "2.0", "-3.595386269724631E307", "-1.7976931348623155E307"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:2>", "<sample:9>", "2.0", "1.1000000000000003"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.1000000000000003, getMaxEvaluations=!NullPointerException, getMin=2.0, getStartValue=1.5500000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "3", "<sample:8>", "<sample:7>", "2.5", "2.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=2.5, getMaxEvaluations=3, getMin=2.5, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "30", "<sample:4>", "<sample:4>", "0.0", "-3.595386269724631E307", "3.0459999999999994"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:1>", "<sample:4>", "1.7976931348623157E308", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=0, getMin=1.7976931348623157E308, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2147483648", "<sample:10>", "<sample:8>", "34.0", "-8.988465674311578E306", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("34.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=!NullPointerException, getMin=34.0, getStartValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "83", "<sample:3>", "<sample:3>", "-Infinity", "0.2"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.2, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-1073741822", "<sample:8>", "<sample:0>", "-0.9999999999999998", "Infinity", "1.4800000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=-1073741822, getMin=-0.9999999999999998, getStartValue=1.4800000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "83", "<sample:8>", "<sample:0>", "-0.9519999999999998", "-8.988465674311578E306"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=83, getMin=-0.9519999999999998, getStartValue=-4.494232837155789E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "13", "<sample:1>", "<sample:0>", "8.988465674311578E306", "34.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=34.0, getMaxEvaluations=13, getMin=8.988465674311578E306, getStartValue=4.494232837155789E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:5>", "<sample:3>", "-2.5061000000000004", "25.061", "34.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=34.0, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=25.061, getMaxEvaluations=2, getMin=-2.5061000000000004, getStartValue=34.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<null>", "<sample:1>", "-1.9999999999999998", "-17.01", "1.1"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-44", "<sample:1>", "<sample:5>", "0.25", "NaN", "3.4000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=NaN, getMaxEvaluations=!NullPointerException, getMin=0.25, getStartValue=3.4000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1073741823", "<sample:6>", "<sample:7>", "3.4000000000000004", "1.0999999999999999", "0.899"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.0999999999999999, getMaxEvaluations=!NullPointerException, getMin=3.4000000000000004, getStartValue=0.899}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"134217756", "<sample:1>", "<null>", "30.3046", "0.0"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:4>", "<sample:4>", "25.061", "-Infinity"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "0", "<sample:2>", "<sample:7>", "5.3", "1.7976931348623155E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.7976931348623155E308, getMaxEvaluations=!NullPointerException, getMin=5.3, getStartValue=8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"33", "<sample:3>", "<sample:6>", "1.7976931348623155E307", "1.1"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=8.988465674311578E306, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.1, getMaxEvaluations=33, getMin=1.7976931348623155E307, getStartValue=8.988465674311578E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:5>", "<sample:7>", "-1.7976931348623155E308", "-679.9999999999999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=-679.9999999999999, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623155E308, getStartValue=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "<sample:0>", "-1.0", "0.0", "17.018"}, false, 7, new String[][]{}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.0, getMaxEvaluations=2147483647, getMin=-1.0, getStartValue=17.018}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"5", "<sample:3>", "<sample:2>", "-8.988465674311578E306", "-8.988465674311578E306"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E306, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=5, getMin=-8.988465674311578E306, getStartValue=-8.988465674311578E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-2", "<sample:8>", "<sample:5>", "-4.7", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.35", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=-4.7, getStartValue=-2.35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getMax=0.0, getMaxEvaluations=!NullPointerException, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "0.49999999999999994"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-16392", "<sample:1>", "<null>", "-0.96", "-0.0", "8.988465674311579E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"-536862718", "<sample:3>", "<sample:4>", "-1.7976931348623155E307", "3.402"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:0>", "<sample:9>", "-25.097", "135.99999999999997"}, false, 7, new String[][]{}, 1), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=135.99999999999997, getMaxEvaluations=42, getMin=-25.097, getStartValue=55.45149999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "37", "<sample:8>", "<sample:7>", "3.0", "2.0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.5, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=2.0, getMaxEvaluations=37, getMin=3.0, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "6", "<sample:13>", "<sample:8>", "-0.9999999999999998", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=!NullPointerException, getMin=-0.9999999999999998, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2147483647", "<sample:4>", "<sample:9>", "1.0379999999999998", "1.8780000000000001", "2.5"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.8780000000000001, getMaxEvaluations=2147483647, getMin=1.0379999999999998, getStartValue=2.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"134217756", "<sample:3>", "<sample:0>", "-2.0", "-7.190772539449262E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.595386269724631E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-7.190772539449262E307, getMaxEvaluations=134217756, getMin=-2.0, getStartValue=-3.595386269724631E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "22", "<sample:7>", "<sample:2>", "3.0459999999999994", "-24.821", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=-24.821, getMaxEvaluations=!NullPointerException, getMin=3.0459999999999994, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"6", "<sample:3>", "<sample:1>", "5.0", "-0.9999999999999999"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.0, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=6, getMin=5.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"83", "<sample:2>", "<sample:6>", "3.4", "0.9390000000000001"}, false, 7, new String[][]{}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1695", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.9390000000000001, getMaxEvaluations=83, getMin=3.4, getStartValue=2.1695}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"20", "<sample:7>", "<sample:8>", "6.2", "-1.7976931348623157E308", "3.0000000000000004"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=3.0000000000000004, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=20, getMin=6.2, getStartValue=3.0000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"33", "<sample:1>", "<sample:7>", "-1.797693134862316E307", "-25.060999999999996"}, false, 2, new String[][]{}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.98846567431158E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-25.060999999999996, getMaxEvaluations=33, getMin=-1.797693134862316E307, getStartValue=-8.98846567431158E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"83", "<sample:4>", "<sample:7>", "0.9390000000000001", "34.05500000000001"}, false, 7, new String[][]{}, 2), new String[][]{{"getValue", "", "7"}, {"getValue", "", "2"}, {"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("17.497000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=34.05500000000001, getMaxEvaluations=83, getMin=0.9390000000000001, getStartValue=17.497000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "8", "<sample:7>", "<sample:12>", "3.046", "-5.0", "0.35000000000000003"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-5.0, getMaxEvaluations=8, getMin=3.046, getStartValue=0.35000000000000003}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"84", "<sample:3>", "<sample:3>", "-0.0", "45.598000000000006", "2.0"}, false, 7, new String[][]{}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=45.598000000000006, getMaxEvaluations=84, getMin=-0.0, getStartValue=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"33", "<sample:8>", "<sample:3>", "-34.0", "-0.9999999999999999"}, false, 7, new String[][]{}, 2), new String[][]{{"getValue", "", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-0.9999999999999999, getMaxEvaluations=33, getMin=-34.0, getStartValue=-17.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-10", "<sample:10>", "<sample:2>", "6.091999999999999", "-1.7976931348623157E308", "67.99999999999999"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=-10, getMin=6.091999999999999, getStartValue=67.99999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"20", "<sample:4>", "<sample:7>", "-3.428", "0.33999999999999997"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "17.0"}}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.544", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=0.33999999999999997, getMaxEvaluations=20, getMin=-3.428, getStartValue=-1.544}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:3>", "<sample:0>", "34.0", "3.0", "-0.7490000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7490000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=3.0, getMaxEvaluations=33, getMin=34.0, getStartValue=-0.7490000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "16", "<sample:2>", "<sample:1>", "-8.988465674311578E307", "3.4000000000000004", "-5.0"}}, 2), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=3.4000000000000004, getMaxEvaluations=16, getMin=-8.988465674311578E307, getStartValue=-5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623155E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "16", "<sample:5>", "<sample:5>", "0.46950000000000003", "0.5", "-2.6980000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=0.5, getMaxEvaluations=16, getMin=0.46950000000000003, getStartValue=-2.6980000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:11>", "<sample:7>", "-8.988465674311579E306", "679.9999999999999", "35.06"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=679.9999999999999, getMaxEvaluations=2147483647, getMin=-8.988465674311579E306, getStartValue=35.06}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"42", "<sample:0>", "<sample:5>", "0.0", "3.045999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getValue", "", "3"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.045999999999999, getMaxEvaluations=42, getMin=0.0, getStartValue=1.5229999999999995}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "134217692", "<sample:5>", "<sample:3>", "-1.0000000000000004", "67.99999999999999", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=67.99999999999999, getMaxEvaluations=!NullPointerException, getMin=-1.0000000000000004, getStartValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"6", "<sample:0>", "<sample:4>", "0.33999999999999997", "-1.7976931348623157E308", "-0.2"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=6, getMin=0.33999999999999997, getStartValue=-0.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "83", "<sample:7>", "<sample:0>", "6.0", "-25.061", "Infinity"}}), new String[][]{{"getPoint", "", "7"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-25.061, getMaxEvaluations=83, getMin=6.0, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"8", "<sample:4>", "<sample:6>", "3.4", "-8.988465674311579E306"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-4.4942328371557894E306, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-8.988465674311579E306, getMaxEvaluations=8, getMin=3.4, getStartValue=-4.4942328371557894E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"33.99999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:2>", "-4.494232837155789E306", "-2.5061", "1.0710000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-2.5061, getMaxEvaluations=2147483647, getMin=-4.494232837155789E306, getStartValue=1.0710000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:0>", "<sample:5>", "4.999999999999999", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-1.7976931348623157E308, getMaxEvaluations=1, getMin=4.999999999999999, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"1", "<sample:5>", "<sample:5>", "1.1", "1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.7976931348623157E308, getMaxEvaluations=1, getMin=1.1, getStartValue=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"2", "<sample:0>", "<sample:9>", "-0.3402", "1.06", "0.5"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.5, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.06, getMaxEvaluations=2, getMin=-0.3402, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "83", "<sample:0>", "<sample:5>", "2.0000000000000004", "1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7500000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.5, getMaxEvaluations=!NullPointerException, getMin=2.0000000000000004, getStartValue=1.7500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:2>", "<sample:6>", "-1.9999999999999998", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getMax=Infinity, getMaxEvaluations=4, getMin=-1.9999999999999998, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "33", "<sample:0>", "<sample:1>", "-1.1", "1.5229999999999997"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=1.5229999999999997, getMaxEvaluations=!NullPointerException, getMin=-1.1, getStartValue=0.2114999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1048576", "<sample:4>", "<sample:4>", "-8.988465674311578E306", "1.1", "0.9390000000000001"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=1.1, getMaxEvaluations=1048576, getMin=-8.988465674311578E306, getStartValue=0.9390000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-536870906", "<sample:3>", "<sample:2>", "9.8", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-Infinity, getMaxEvaluations=-536870906, getMin=9.8, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"65", "<sample:5>", "<sample:4>", "NaN", "-8.988465674311578E306", "-0.5"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "3.9999999999999996"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:6>", "0.0", "-2.2", "0.8300000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-0.5, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=65, getMin=NaN, getStartValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"34.0"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2", "<sample:4>", "<sample:4>", "-4.9", "-1.21"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=-1.21, getMaxEvaluations=2, getMin=-4.9, getStartValue=-3.055}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMin", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"21", "<sample:2>", "<sample:2>", "1.1", "1.0"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=1.05, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=1.0, getMaxEvaluations=21, getMin=1.1, getStartValue=1.05}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"4", "<sample:0>", "<sample:3>", "11.0", "-25.061", "0.20000000000000004"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.20000000000000004, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-25.061, getMaxEvaluations=4, getMin=11.0, getStartValue=0.20000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", "double", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "35", "<sample:3>", "<sample:9>", "2.9999999999999996", "8.988465674311578E307"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=8.988465674311578E307, getMaxEvaluations=35, getMin=2.9999999999999996, getStartValue=4.494232837155789E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:0>", "<sample:2>", "Infinity", "-0.19999999999999996", "-25.061"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=34, getGoalType=MAXIMIZE, getMax=-0.19999999999999996, getMaxEvaluations=33, getMin=Infinity, getStartValue=-25.061}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-2.822"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "1073741823", "<sample:5>", "<sample:5>", "-8.988465674311576E306", "-0.5020000000000002", "-1.3199999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-0.5020000000000002, getMaxEvaluations=1073741823, getMin=-8.988465674311576E306, getStartValue=-1.3199999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-21", "<sample:5>", "<sample:9>", "Infinity", "-Infinity", "0.275"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "51", "<sample:3>", "<sample:2>", "Infinity", "1.0000000000000002", "0.64"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=52, getGoalType=MAXIMIZE, getMax=1.0000000000000002, getMaxEvaluations=51, getMin=Infinity, getStartValue=0.64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483645", "<sample:2>", "<sample:8>", "-1.0", "67.94599999999998"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("67.94599999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=67.94599999999998, getMaxEvaluations=2147483645, getMin=-1.0, getStartValue=33.47299999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double"}, new String[]{"83", "<sample:2>", "<sample:5>", "2.0", "34.00000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=34.00000000000001, getMaxEvaluations=83, getMin=2.0, getStartValue=18.000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-2", "<sample:4>", "<sample:1>", "-1.7976931348623155E307", "-4.9E-324", "Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-4.9E-324, getMaxEvaluations=-2, getMin=-1.7976931348623155E307, getStartValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483630", "<sample:6>", "<sample:8>", "-1.7976931348623155E307", "20.0", "-9.999999999999998"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=20.0, getMaxEvaluations=!NullPointerException, getMin=-1.7976931348623155E307, getStartValue=-9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "-22", "<sample:2>", "<sample:3>", "-Infinity", "1.5"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=1.5, getMaxEvaluations=-22, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "2147483647", "<sample:4>", "<sample:0>", "-1.0000000000000002", "0.05"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=0.05, getMaxEvaluations=2147483647, getMin=-1.0000000000000002, getStartValue=-0.4750000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"-3.5953862697246315E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:3>", "<sample:0>", "-3.402", "-2.0", "-Infinity"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "4", "<sample:0>", "<sample:7>", "-2.0", "-5.6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-5.6, getMaxEvaluations=4, getMin=-2.0, getStartValue=-3.8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "59", "<sample:5>", "<sample:6>", "-1.7976931348623157E308", "0.11000000000000003"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311579E307, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getMax=0.11000000000000003, getMaxEvaluations=59, getMin=-1.7976931348623157E308, getStartValue=-8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-6", "<sample:3>", "<sample:7>", "NaN", "-3.4", "-25.033000000000005"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-3.4, getMaxEvaluations=-6, getMin=NaN, getStartValue=-25.033000000000005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"3.5953862697246315E307"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:7>", "<sample:9>", "-8.988465674311579E306", "53.0", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=53.0, getMaxEvaluations=5, getMin=-8.988465674311579E306, getStartValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:9>", "<sample:9>", "34.0", "0.9390000000000001", "-1.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MINIMIZE, getMax=0.9390000000000001, getMaxEvaluations=!NullPointerException, getMin=34.0, getStartValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "1", "<sample:6>", "<sample:7>", "-Infinity", "-34.6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=-34.6, getMaxEvaluations=1, getMin=-Infinity, getStartValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"5", "<sample:4>", "<sample:3>", "-13.608", "-8.988465674311578E306", "-9.999999999999998"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-9.999999999999998, getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-8.988465674311578E306, getMaxEvaluations=5, getMin=-13.608, getStartValue=-9.999999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "42", "<sample:0>", "<sample:4>", "-Infinity", "5.0", "0.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "-35", "<null>", "<sample:0>", "-0.9999999999999999", "0.09390000000000001", "-3.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=5.0, getMaxEvaluations=!NullPointerException, getMin=-Infinity, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getMax=0.0, getMaxEvaluations=0, getMin=0.0, getStartValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "computeObjectiveValue", new String[]{"double"}, new String[]{"0.5"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2147483647", "<sample:6>", "<sample:5>", "1.7976931348623155E307", "99.39", "3.045999999999999"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1547005383792515", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=99.39, getMaxEvaluations=2147483647, getMin=1.7976931348623155E307, getStartValue=3.045999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"33", "<sample:2>", "<sample:5>", "-8.988465674311578E307", "3.0459999999999994", "-34.02"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double", "33", "<sample:1>", "<sample:3>", "Infinity", "0.25"}}, 3), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-34.02", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.0459999999999994, getMaxEvaluations=33, getMin=-8.988465674311578E307, getStartValue=-34.02}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "33", "<sample:0>", "<sample:9>", "NaN", "36.939", "-1.7976931348623157E308"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=34, getGoalType=MINIMIZE, getMax=36.939, getMaxEvaluations=33, getMin=NaN, getStartValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"141", "<sample:4>", "<sample:6>", "-8.988465674311577E305", "-1.7976931348623155E307", "0.5"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=0.5, getValue=-1.1547005383792515}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getMax=-1.7976931348623155E307, getMaxEvaluations=141, getMin=-8.988465674311577E305, getStartValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "134", "<sample:5>", "<sample:3>", "0.5000000000000001", "0.3402", "-8.988465674311578E306"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=-8.988465674311578E306, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getMax=0.3402, getMaxEvaluations=134, getMin=0.5000000000000001, getStartValue=-8.988465674311578E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.UnivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double", "double", "double"}, new String[]{"8", "<sample:1>", "<sample:11>", "1.7976931348623158E307", "3.0459999999999994", "2.2"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=2.2, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=3.0459999999999994, getMaxEvaluations=8, getMin=1.7976931348623158E307, getStartValue=2.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "2", "<sample:2>", "<sample:7>", "-0.0", "-6.0", "680.0"}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getMax", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getMax=-6.0, getMaxEvaluations=2, getMin=-0.0, getStartValue=680.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "42", "<sample:7>", "<sample:10>", "Infinity", "-0.5999999999999998", "67.99999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=43, getGoalType=MAXIMIZE, getMax=-0.5999999999999998, getMaxEvaluations=42, getMin=Infinity, getStartValue=67.99999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.univariate.BrentOptimizer", "org.apache.commons.math3.optimization.univariate.BrentOptimizer", "getStartValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.univariate.BrentOptimizer", "optimize", "int,org.apache.commons.math3.analysis.UnivariateFunction,org.apache.commons.math3.optimization.GoalType,double,double,double", "5", "<sample:8>", "<sample:4>", "-0.04", "38.939", "68.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("68.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=MAXIMIZE, getMax=38.939, getMaxEvaluations=!NullPointerException, getMin=-0.04, getStartValue=68.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
