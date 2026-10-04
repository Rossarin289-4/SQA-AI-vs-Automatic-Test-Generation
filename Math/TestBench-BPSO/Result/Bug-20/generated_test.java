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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99920", "<sample:1>", "<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "43", "<sample:9>", "<sample:0>", "<sample:1>", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=43, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"718759", "<sample:7>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "134217748", "<sample:6>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=718759, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"969", "<sample:4>", "<sample:12>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:4>", "<sample:2>", "<sample:4>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=969, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "999", "<sample:4>", "<sample:11>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:12>", "<sample:10>", "<sample:1>", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -1.0], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"969", "<sample:5>", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:9>", "<sample:10>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=969, getStartPoint=[0.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000000", "<sample:4>", "<sample:9>", "<sample:0>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=77, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=10000000, getStartPoint=[-1.0], getUpperBound=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:0>", "<sample:6>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:1>", "<sample:2>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-99920", "<sample:3>", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-99920, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438427", "<sample:5>", "<sample:6>", "<sample:1>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-44", "<null>", "<sample:5>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"16877216", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-6", "<sample:2>", "<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1438541", "<sample:6>", "<sample:2>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"8388630", "<sample:4>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=99, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=8388630, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "49987", "<sample:4>", "<sample:5>", "<sample:4>", "<sample:3>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-4", "<sample:0>", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getRelativeThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:8>", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483647", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:6>", "<sample:8>", "<sample:4>"}, false, 0, null, 1), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:2>", "<null>", "<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:5>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 1), new String[][]{{"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:6>", "<sample:10>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1044", "<sample:3>", "<sample:7>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1044", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1044, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:9>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:6>", "<empty>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"9", "<sample:5>", "<sample:2>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"9107858", "<sample:3>", "<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 3), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-50", "<sample:5>", "<sample:2>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-50, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:8>", "<sample:1>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-8", "<sample:6>", "<sample:11>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:9>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:9>", "<sample:9>", "<sample:4>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1001", "<sample:0>", "<sample:1>", "<sample:3>", "<sample:4>", "<sample:7>"}}, 2), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:5>", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483604", "<sample:12>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483604, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1437500", "<sample:10>", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-33554429", "<sample:0>", "<sample:0>", "<sample:5>", "<empty>", "<sample:6>"}}, 1), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "719310", "<sample:4>", "<sample:10>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=719310, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:9>", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:4>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483599", "<sample:9>", "<sample:5>", "<empty>", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"16877216", "<sample:4>", "<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-68547405", "<sample:7>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:3>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"999", "<sample:0>", "<sample:3>", "<empty>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-999", "<sample:5>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-983", "<sample:0>", "<sample:2>", "<sample:1>", "<empty>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100000", "<sample:6>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100029", "<sample:6>", "<sample:4>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<sample:3>", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100003", "<sample:0>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100003, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "3"}, {"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:1>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"listIterator", "", "5"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"134317742", "<sample:5>", "<sample:0>", "<null>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1438588", "<null>", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"16877216", "<sample:6>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "100001", "<sample:6>", "<sample:7>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=100001, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99920", "<sample:2>", "<sample:0>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=99920, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:6>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-16", "<sample:6>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:0>", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438287", "<sample:2>", "<sample:6>", "<sample:8>"}}), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483647", "<sample:7>", "<sample:3>", "<sample:6>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000016", "<sample:4>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99897", "<sample:3>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1446735", "<sample:0>", "<sample:10>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99897, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:2>", "<sample:4>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, Infinity, -Infinity], getPointRef=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100432", "<sample:6>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"getKey", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=100432, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"134217723", "<sample:5>", "<sample:9>", "<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=134217723, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100127", "<sample:4>", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=100127, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<null>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:4>", "<sample:0>", "<empty>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"8", "<sample:0>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999939", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=8, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:0>", "<sample:4>"}}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:6>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1438543, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "524266", "<null>", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "16777215", "<sample:4>", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=16777215, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-4", "<sample:1>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-4, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:3>", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=3, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:6>", "<sample:6>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-988", "<sample:4>", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-988, getStartPoint=[1.0, Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438547", "<sample:6>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1438547, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getAbsoluteThreshold", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "16877170", "<sample:1>", "<sample:1>", "<sample:5>", "<sample:2>", "<sample:0>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1438607", "<sample:3>", "<sample:1>", "<sample:7>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-1438607, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "33", "<sample:10>", "<sample:11>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=33, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:3>", "<sample:11>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:6>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999999, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "962", "<sample:6>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=962, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99846", "<sample:1>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99846, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:9>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-10", "<sample:6>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-10, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438496", "<sample:9>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438496, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "43", "<sample:5>", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=44, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=43, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"10000001", "<sample:3>", "<sample:5>", "<sample:1>", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=2147483647, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}), new String[][]{{"addAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:6>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1438542, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#-1011937282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:4>", "<sample:1>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:2>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-16", "<sample:4>", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-16, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-16", "<sample:6>", "<sample:9>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:10>", "<sample:9>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1438542, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-132779185", "<sample:4>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-132779185, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147482624", "<sample:1>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2147482624, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "132742", "<sample:2>", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132742", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=132742, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:0>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:9>", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438797", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438797, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99974", "<sample:2>", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99974, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:9>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438542, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "21", "<sample:4>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=21, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"131072", "<sample:6>", "<sample:3>", "<sample:0>", "<null>", "<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=131072, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20000016", "<sample:1>", "<sample:8>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:3>", "<sample:9>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438541, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"listIterator", "", "2"}, {"hasPrevious", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:4>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:6>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438541, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483615", "<sample:6>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483615", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2147483615, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-16777213", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:3>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "18215757", "<sample:3>", "<sample:9>", "<sample:4>"}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=18215757, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "42", "<sample:2>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=42, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-23", "<sample:0>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-23, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:9>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "359627", "<sample:0>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:3>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "16877264", "<sample:6>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16877264", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=16877264, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:0>", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=20, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1", "<sample:0>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:2>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=3, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5131072", "<sample:7>", "<sample:9>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5131072, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:2>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1001, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1437517", "<sample:8>", "<sample:5>", "<sample:3>"}}), new String[][]{{"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1437517, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "45", "<sample:9>", "<sample:4>", "<sample:7>"}}), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-9999999", "<sample:1>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"add", "java.lang.Object", "2"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:7>", "<sample:1>"}}), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"719270", "<null>", "<sample:6>", "<sample:5>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "720279", "<sample:5>", "<sample:8>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:4>", "<sample:6>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99974", "<sample:4>", "<sample:9>", "<sample:0>", "<sample:2>", "<sample:5>"}}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4118", "<sample:6>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=4118, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-4194299", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-4194299, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:5>", "<sample:11>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:12>", "<sample:11>", "<sample:3>"}}), new String[][]{{"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "719255", "<sample:12>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("719255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=719255, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:0>", "<sample:11>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999999, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438602", "<sample:6>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438602, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:1>", "<sample:8>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438541, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-133498493", "<sample:6>", "<sample:10>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-133498493, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-9", "<sample:6>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438542", "<sample:2>", "<sample:9>", "<sample:1>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:3>", "<null>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:9>", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "112", "<sample:1>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=112, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-99990", "<sample:5>", "<sample:9>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-262101", "<sample:9>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-262101, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:2>", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:10>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[Infinity], getMaxEvaluations=-2147483648, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:0>", "<sample:11>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-1, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:3>", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[0.0], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1437519", "<sample:5>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1437519, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#447348645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1437517", "<sample:4>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:12>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1437517, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:1>", "<sample:10>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"135656260", "<sample:8>", "<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=135656260, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1437479", "<sample:1>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1437479, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:12>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:2>", "<sample:5>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "65520", "<sample:5>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:6>", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-2147483648, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:3>", "<sample:8>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1067", "<sample:2>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-20", "<sample:6>", "<sample:7>", "<sample:5>", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-20, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-999", "<sample:7>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-999, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"200118", "<sample:6>", "<sample:11>", "<sample:5>"}, false, 0, null, 2), new String[][]{{"getSecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=200118, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "16877216", "<null>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"4999999", "<sample:1>", "<sample:1>", "<sample:2>", "<sample:2>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:6>", "<sample:2>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=20, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:7>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=20, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10", "<sample:7>", "<sample:12>", "<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"3", "<sample:5>", "<null>", "<sample:3>", "<sample:3>", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:10>", "<sample:8>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "719255", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999942", "<sample:1>", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9999942", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=9999942, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99920", "<sample:7>", "<sample:11>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99920, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:11>", "<sample:9>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1000, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]...#201#957099254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"0", "<null>", "<sample:10>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:9>", "<sample:11>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:1>", "<sample:12>", "<sample:2>", "<empty>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-Infinity, -1.0], getPointRef=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:9>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483647, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1437572", "<sample:13>", "<sample:7>", "<sample:0>"}}), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1437572, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99920", "<sample:6>", "<sample:1>", "<sample:0>"}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99920, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2097150", "<sample:9>", "<sample:8>", "<sample:3>"}, false, 5, new String[][]{}, 2), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2097150, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:9>", "<null>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"499", "<sample:12>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=499, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:9>", "<sample:6>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1073741823", "<sample:0>", "<sample:11>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1073741823, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:9>", "<sample:4>", "<null>", "<sample:3>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"add", "java.lang.Object", "7"}, {"trimToSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "536871912", "<sample:6>", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "", "3"}, {"nextIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:0>", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:12>", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"8438608", "<sample:3>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "719275", "<sample:0>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
}
