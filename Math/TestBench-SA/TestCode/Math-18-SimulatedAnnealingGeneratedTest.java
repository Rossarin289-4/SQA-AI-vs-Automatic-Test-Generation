package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:1>", "<sample:1>", "<sample:1>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:8>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:3>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1", "<sample:5>", "<sample:4>", "<sample:1>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "8", "<sample:3>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=8, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:4>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2013269945", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2", "<sample:4>", "<sample:3>", "<sample:2>", "<empty>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=2013269945, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"30", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:1>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "268635450", "<sample:1>", "<sample:1>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:6>", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1000", "<sample:9>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"getValue", "", "3"}, {"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=77, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=1000, getStartPoint=[-1.0], getUpperBound=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:6>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3), new String[][]{{"getValue", "", "1"}, {"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=10000001, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=10000001, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=5000000, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "5000000", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=5000000, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-5000000", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:8>", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438484", "<sample:8>", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438484, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438484", "<sample:8>", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=4999997, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:8>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 2), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=30, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=4999997, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:1>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "100035", "<sample:6>", "<sample:1>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=100035, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:1>", "<null>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:5>", "<sample:3>", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:7>", "<sample:8>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:10>", "<empty>", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=50016, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:10>", "<sample:3>", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:10>", "<sample:3>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:8>", "<sample:5>", "<sample:2>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:8>", "<sample:5>", "<null>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:8>", "<sample:5>", "<null>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:1>", "<null>", "<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<null>", "<sample:7>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<sample:8>", "<sample:8>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<sample:8>", "<sample:7>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-17", "<sample:8>", "<sample:7>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-34", "<sample:7>", "<sample:4>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-17", "<sample:7>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:1>", "<sample:4>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"5", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1963", "<sample:1>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1920", "<sample:5>", "<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:5>", "<sample:3>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:1>", "<sample:6>", "<null>"}}, 2), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=57, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1920, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=85, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:5>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1176285", "<sample:3>", "<sample:8>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:5>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1176285, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:3>", "<sample:8>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:5>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1176285", "<sample:2>", "<sample:1>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:5>", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1176285, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1275068454", "<sample:2>", "<sample:4>", "<sample:1>"}, false, 11, new String[][]{}, 1), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1275068454, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1275068447", "<sample:2>", "<sample:4>", "<sample:1>"}, false, 11, new String[][]{}, 1), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1275068447, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<null>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:5>", "<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3), new String[][]{{"getKey", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=109, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:8>", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"3", "<sample:8>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:1>", "<sample:3>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:7>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getFirst", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getFirst", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000000", "<sample:1>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<sample:7>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=99999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:0>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:6>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:6>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1000", "<sample:6>", "<sample:4>", "<null>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99999", "<null>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:8>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"getValue", "", "3"}, {"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=10000001, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:5>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"getValue", "", "1"}, {"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:7>", "<sample:2>", "<sample:0>", "<null>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4999997", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:8>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1000", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:1>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "99999", "<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "49999", "<sample:7>", "<sample:8>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=49999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "49999", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=49999, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:8>", "<sample:3>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=50016, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "50016", "<sample:7>", "<sample:10>", "<sample:2>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=50016, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity...#202#904269920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438542", "<sample:7>", "<sample:5>", "<sample:1>"}, false), new String[][]{{"getSecond", "", "6"}, {"getSecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1438542, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438542", "<sample:7>", "<sample:5>", "<sample:0>"}, false), new String[][]{{"getSecond", "", "6"}, {"getSecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438542, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438542", "<sample:7>", "<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "7"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:4>", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:8>", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:7>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#2070441781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:7>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1826904918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"size", "", "6"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1001", "<sample:1>", "<sample:3>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"966", "<null>", "<sample:3>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"982", "<sample:2>", "<sample:3>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438542", "<sample:7>", "<sample:7>", "<empty>", "<sample:2>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1963", "<sample:1>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<sample:8>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100001, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:2>", "<sample:7>", "<sample:5>"}}, 2), new String[][]{{"getSecond", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:2>", "<sample:8>", "<empty>"}}), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"removeAll", "java.util.Collection", "6"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 2), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1073741823", "<sample:0>", "<sample:2>", "<null>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "7"}, {"remove", "java.lang.Object", "4"}, {"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:2>", "<sample:8>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"getSecond", "", "5"}, {"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"getSecond", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:2>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:8>", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:8>", "<sample:4>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:8>", "<sample:4>", "<null>"}}, 2), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:8>", "<sample:4>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000038", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000038, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=5000000, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000000", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5000000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"56", "<sample:4>", "<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "3"}, {"getRelativeThreshold", "", "3"}, {"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:0>", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483584", "<sample:8>", "<sample:0>", "<sample:3>"}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483584, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483584", "<sample:8>", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483584, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"getRelativeThreshold", "", "6"}, {"getAbsoluteThreshold", "", "2"}, {"getRelativeThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438541", "<sample:1>", "<null>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"10000000", "<sample:7>", "<sample:5>", "<sample:1>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483584", "<sample:6>", "<sample:9>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"getSecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483584, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:9>", "<sample:9>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"getSecond", "", "0"}, {"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=114, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:8>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1), new String[][]{{"getSecond", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"trimToSize", "", "0"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<null>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"10", "<sample:5>", "<sample:8>", "<empty>", "<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:8>", "<null>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:8>", "<sample:3>", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:4>", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<null>", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 2), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:1>", "<sample:7>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<sample:8>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100001, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"isEmpty", "", "5"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:6>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "56", "<sample:3>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=56, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"getRelativeThreshold", "", "7"}, {"getAbsoluteThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<sample:8>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100001, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:4>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<null>", "<null>", "<sample:0>"}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "1"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "6"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:8>", "<null>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:3>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[-1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"4", "<sample:0>", "<null>", "<empty>", "<null>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:6>", "<sample:1>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=5, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"add", "java.lang.Object", "5"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:3>", "<sample:5>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=5, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 1), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "4", "<sample:3>", "<sample:6>", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=4, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "5"}, {"remove", "java.lang.Object", "2"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:7>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:7>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:7>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:6>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:1>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:7>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:3>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1000, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1018", "<sample:3>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1018, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1018", "<sample:7>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1018, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1018", "<sample:7>", "<sample:8>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=1018, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"trimToSize", "", "3"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "9999999", "<sample:0>", "<sample:8>", "<sample:2>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=9999999, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:1>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:2>", "<null>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:0>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1438542, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#-885065584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:0>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1438542, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#-1178067560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:0>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438542, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<null>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<null>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<null>", "<sample:2>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "208150", "<sample:5>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=208150, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"999", "<sample:0>", "<sample:5>", "<empty>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"remove", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:1>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:1>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1000, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
}
