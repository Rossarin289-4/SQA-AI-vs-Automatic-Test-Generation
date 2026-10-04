package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:10>", "<sample:4>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:0>", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1000, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"10000001", "<sample:2>", "<sample:3>", "<sample:6>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1250084", "<sample:4>", "<sample:7>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1250084, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99941", "<sample:1>", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:4>", "<sample:5>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:5>", "<sample:8>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:10>", "<sample:7>", "<sample:0>", "<null>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1048598", "<sample:1>", "<sample:6>", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getFirst", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=181, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1048598, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483623", "<sample:11>", "<sample:7>", "<sample:8>"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:7>", "<null>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483623, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "500", "<sample:8>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:10>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "1"}, {"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"719270", "<sample:0>", "<sample:5>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147352575", "<sample:3>", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "9999999", "<sample:6>", "<sample:6>", "<sample:5>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "22", "<sample:1>", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:6>"}}), new String[][]{{"getValue", "", "4"}, {"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147352575, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483640", "<sample:3>", "<sample:0>", "<sample:5>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "19", "<sample:10>", "<sample:0>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999999, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:4>", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1001, getStartPoint=[], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=2, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:0>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}}, 1), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}}, 1), new String[][]{{"getValue", "", "2"}, {"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:7>", "<sample:4>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:10>", "<null>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:0>", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<null>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:0>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=227, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<null>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:0>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:0>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=27, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<null>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 2), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<null>", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<null>", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:1>", "<sample:4>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:2>", "<sample:5>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:0>", "<sample:7>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:0>", "<sample:7>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=29, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:2>", "<sample:7>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=29, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:0>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "34797991", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:2>", "<sample:2>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=34797991, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"3", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:5>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"10000001", "<sample:1>", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<null>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:6>", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRelativeThreshold", "", "0"}, {"getRelativeThreshold", "", "2"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"100000", "<sample:10>", "<sample:3>", "<null>", "<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}}), new String[][]{{"add", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999999, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:2>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:2>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=1438541, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "0", "<sample:0>", "<sample:4>", "<sample:1>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=0, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:2>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:3>"}}), new String[][]{{"getSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=66, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:5>"}}), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:5>"}}), new String[][]{{"getSecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=130, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:5>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=5, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-28554432", "<sample:10>", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:10>", "<sample:4>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:0>", "<sample:4>", "<sample:0>"}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1000, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100001", "<sample:3>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:10>", "<null>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:0>", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:7>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1438542", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438542, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"getAbsoluteThreshold", "", "4"}, {"getRelativeThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "100001", "<null>", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:0>"}}), new String[][]{{"getAbsoluteThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"isEmpty", "", "4"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"20", "<sample:7>", "<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<null>", "<sample:2>", "<sample:1>"}}), new String[][]{{"add", "java.lang.Object", "3"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:2>", "<sample:6>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=29, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:10>", "<sample:0>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:7>", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=5000000, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100000", "<sample:2>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "21", "<sample:0>", "<sample:1>", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:2>", "<empty>", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-2, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:4>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, Infinity, -Infinity], getPointRef=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"20", "<sample:6>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=20, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"clone", "", "5"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1000", "<sample:3>", "<sample:7>", "<sample:3>"}, false), new String[][]{{"getValue", "", "5"}, {"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1000, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"99999", "<null>", "<sample:1>", "<null>", "<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1250084", "<null>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:1>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"getFirst", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99999", "<sample:0>", "<sample:7>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<null>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:5>", "<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:1>", "<sample:10>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:0>", "<sample:5>", "<null>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:10>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:10>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:1>", "<sample:5>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:3>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"20", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:3>", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=21, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=20, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"20", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:3>", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=21, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=20, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:8>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:3>", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:5>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:3>", "<sample:4>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:7>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:3>", "<sample:4>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:2>", "<sample:4>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483135", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99941", "<sample:1>", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:5>", "<sample:3>"}}, 2), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483135, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483214", "<sample:2>", "<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99941", "<sample:1>", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:5>", "<sample:5>", "<sample:3>"}}, 2), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483214, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483214", "<sample:2>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:5>", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483214, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483214", "<sample:2>", "<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:5>", "<sample:4>"}}, 1), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483214, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:10>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438541", "<sample:10>", "<null>", "<sample:6>", "<null>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10", "<sample:10>", "<sample:5>", "<sample:2>", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1438543", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1000", "<sample:7>", "<sample:5>", "<null>", "<sample:5>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100000", "<sample:3>", "<sample:3>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:5>", "<sample:6>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:7>", "<sample:0>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=100000, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:6>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=29, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:2>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"536870878", "<sample:3>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=536870878, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"268435412", "<sample:3>", "<sample:2>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"getSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=268435412, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"130022378", "<sample:3>", "<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:10>", "<null>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:7>", "<sample:7>", "<sample:2>"}}, 3), new String[][]{{"getSecond", "", "5"}, {"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=130022378, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:3>", "<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<sample:1>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:4>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:7>", "<sample:2>", "<sample:6>", "<null>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:10>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<null>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:7>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438542, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:4>", "<sample:4>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=4, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"20", "<sample:2>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:10>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<null>", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<null>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:0>", "<null>", "<sample:8>", "<sample:8>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:0>", "<sample:5>", "<sample:8>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10000000, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100000", "<sample:2>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"ensureCapacity", "int", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438543, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:2>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=21, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "3"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "1"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438543, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"add", "int,java.lang.Object", "2"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2002", "<sample:4>", "<sample:2>", "<sample:7>", "<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2002", "<sample:4>", "<null>", "<sample:7>", "<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:11>", "<sample:7>", "<sample:0>", "<sample:8>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-4", "<sample:10>", "<sample:7>", "<sample:0>", "<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:16>", "<sample:6>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:10>", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=21, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:10>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=21, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"remove", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<null>", "<sample:3>", "<sample:8>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438574", "<sample:0>", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1001", "<sample:4>", "<sample:1>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483613", "<sample:5>", "<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483613, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:4>", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=21, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "47", "<sample:4>", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=47, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:5>", "<sample:4>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-1, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:5>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-1, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:5>", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-1, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3), new String[][]{{"ensureCapacity", "int", "6"}, {"contains", "java.lang.Object", "1"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:6>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=29, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:1>", "<sample:6>", "<sample:8>"}}, 1), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=999, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1000", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:5>", "<empty>"}}, 1), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1000", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:5>", "<empty>"}}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:10>", "<sample:5>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1001, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infinity...#202#1077430966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1250084", "<sample:3>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1250084, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1250084", "<sample:3>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1250084, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1250084", "<sample:3>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1250084, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1250084", "<sample:3>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1250084, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"clone", "", "4"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"clone", "", "4"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}}), new String[][]{{"getRelativeThreshold", "", "3"}, {"getAbsoluteThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:2>", "<sample:3>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:1>", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100000, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:4>", "<sample:5>", "<empty>"}}, 3), new String[][]{{"remove", "java.lang.Object", "6"}, {"isEmpty", "", "5"}, {"clear", "", "7"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=3, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:4>", "<sample:8>", "<empty>"}}, 3), new String[][]{{"remove", "java.lang.Object", "6"}, {"isEmpty", "", "5"}, {"clear", "", "7"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=3, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:6>", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99999, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:6>", "<sample:8>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99999, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10", "<null>", "<null>", "<null>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=21, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10", "<null>", "<null>", "<null>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=21, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10", "<null>", "<null>", "<null>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:4>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10", "<null>", "<null>", "<null>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
}
