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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-267716186", "<sample:7>", "<sample:4>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:3>", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"18951426", "<sample:8>", "<sample:4>", "<sample:12>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-65534", "<sample:2>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-37", "<sample:7>", "<sample:8>", "<sample:8>", "<null>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-37, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, -Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"8", "<sample:4>", "<sample:2>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "17416", "<sample:0>", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=8, getStartPoint=[-1.0, 0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1000", "<sample:4>", "<sample:9>", "<sample:10>", "<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:8>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=133, getGoalType=MINIMIZE, getLowerBound=[-1.0, 0.0], getMaxEvaluations=1000, getStartPoint=[-1.0, 0.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483646", "<sample:9>", "<sample:6>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3", "<sample:2>", "<sample:9>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"999", "<sample:2>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:6>"}, false, 4, new String[][]{}), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"clone", "", "7"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:7>", "<sample:1>", "<sample:5>", "<empty>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4999940", "<null>", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "0", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:7>", "<sample:2>", "<empty>", "<empty>"}}, 3), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1029", "<sample:2>", "<sample:8>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1029, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]...#201#-641064131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-10000058", "<null>", "<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<sample:2>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:10>", "<sample:3>", "<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity, -Infinity, -1.0], getPointRef=[Infinity, -Infinity, -1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"719271", "<sample:1>", "<sample:8>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:6>", "<null>"}}, 3), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:5>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999922", "<sample:0>", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=9999922, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:1>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000000, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483583", "<sample:0>", "<sample:3>", "<sample:8>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-100058", "<sample:4>", "<sample:0>", "<null>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1001", "<sample:7>", "<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"65544", "<sample:1>", "<sample:1>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:6>", "<sample:8>", "<sample:3>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100058", "<sample:7>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"clear", "", "4"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483615", "<sample:1>", "<sample:7>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-267716219", "<sample:4>", "<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "49999", "<sample:5>", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:4>", "<sample:10>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-57", "<sample:1>", "<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"50024", "<sample:8>", "<sample:2>", "<sample:5>", "<sample:8>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"719278", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-267847237", "<sample:2>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-18951425", "<sample:3>", "<null>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:2>", "<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:2>", "<null>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:3>", "<sample:5>", "<sample:3>", "<empty>", "<null>"}}, 2), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clear", "", "2"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "26", "<sample:4>", "<sample:7>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=26, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-16", "<sample:6>", "<sample:8>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-16, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-535432372", "<sample:2>", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-535432372, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1001", "<sample:3>", "<sample:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1070864764", "<sample:0>", "<sample:6>", "<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"3", "<sample:3>", "<sample:3>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1", "<sample:0>", "<sample:2>", "<sample:10>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[-1.0, 0.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"719278", "<sample:7>", "<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100044", "<sample:6>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"getRelativeThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438542", "<sample:0>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-4", "<sample:0>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-4, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-1438543", "<sample:4>", "<sample:6>", "<null>", "<sample:2>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "6"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100037", "<null>", "<sample:1>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<null>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:5>", "<sample:1>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1991", "<null>", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-267716186", "<sample:4>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-267716186, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1070864744", "<null>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1", "<sample:8>", "<sample:3>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4999968", "<sample:6>", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-14", "<sample:7>", "<sample:6>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "132787", "<sample:5>", "<sample:7>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=132787, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "8", "<sample:8>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=8, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483647", "<sample:3>", "<sample:0>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:3>", "<null>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:5>", "<sample:5>", "<sample:3>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "18951426", "<sample:1>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "132829", "<sample:0>", "<null>", "<sample:1>", "<sample:0>", "<empty>"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100058", "<sample:6>", "<sample:8>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:4>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "18951388", "<null>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-500", "<sample:7>", "<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-18951426", "<sample:8>", "<sample:2>", "<empty>"}}), new String[][]{{"listIterator", "", "3"}, {"previousIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-18951426, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-132778", "<sample:7>", "<sample:1>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "100123", "<sample:5>", "<sample:1>", "<sample:5>", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "25", "<sample:4>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=25, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-200000", "<sample:3>", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4999968", "<sample:0>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1000", "<null>", "<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1001", "<sample:0>", "<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:4>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"524288", "<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"getSecond", "", "0"}, {"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=91, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=524288, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:4>", "<sample:4>"}}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000051", "<sample:7>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000051, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-58", "<sample:3>", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-58, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1438482", "<sample:0>", "<sample:4>", "<empty>", "<sample:1>", "<sample:8>"}}), new String[][]{{"addAll", "java.util.Collection", "2"}, {"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$SubList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "265538", "<sample:5>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=265538, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1073741823", "<sample:2>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741823, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:1>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=999, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-30", "<sample:7>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-30, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2", "<sample:14>", "<sample:8>", "<null>", "<sample:0>", "<sample:6>"}}), new String[][]{{"removeAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000015", "<sample:8>", "<sample:2>", "<sample:1>", "<sample:3>", "<sample:7>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-6", "<sample:6>", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:11>", "<sample:2>", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-155687049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"9999950", "<sample:1>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{}), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999950, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5008160", "<sample:3>", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2", "<null>", "<sample:2>", "<sample:9>", "<sample:3>", "<sample:10>"}}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"remove", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483647", "<sample:8>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-47108862", "<sample:4>", "<sample:11>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-47108862, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"18951398", "<sample:3>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "45", "<sample:8>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=18951398, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "132769", "<sample:0>", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=132769, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infini...#204#-1286529590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "7"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2877084", "<sample:1>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2877084, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1073741823", "<sample:6>", "<sample:7>", "<sample:2>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9", "<sample:3>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-4", "<sample:3>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-965", "<sample:7>", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999988", "<sample:3>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9999988", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999988, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-10000000", "<sample:5>", "<sample:3>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-10000000, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Inf...#207#1472177599", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<null>", "<sample:0>", "<sample:8>"}}), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"499", "<sample:6>", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "139217696", "<sample:8>", "<sample:8>", "<empty>", "<sample:9>", "<sample:5>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3), new String[][]{{"getFirst", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=499, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"getRelativeThreshold", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100058", "<sample:4>", "<sample:4>", "<sample:12>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=100058, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4737830", "<sample:5>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4737830", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=4737830, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:6>", "<sample:0>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=10000000, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"9475652", "<sample:4>", "<sample:1>", "<null>", "<sample:4>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147482624", "<sample:3>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147482624, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483647", "<sample:5>", "<sample:4>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483647, getStartPoint=[1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "2"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-989", "<sample:9>", "<sample:6>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "18951436", "<sample:6>", "<sample:8>", "<empty>", "<sample:12>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-989, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1000", "<sample:0>", "<sample:6>", "<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=103, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1000, getStartPoint=[-1.0, 0.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-8388604", "<sample:5>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-8388604, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-936", "<sample:6>", "<sample:0>", "<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"132807", "<sample:2>", "<sample:5>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=132807, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-500", "<sample:8>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100058", "<sample:6>", "<sample:9>", "<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=100058, getStartPoint=[-1.0, 0.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:11>", "<sample:6>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1504", "<sample:4>", "<sample:3>", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1504, getStartPoint=[-1.0, 0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-10", "<sample:6>", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-10, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:3>", "<sample:11>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100001", "<sample:3>", "<sample:7>", "<sample:2>"}}), new String[][]{{"ensureCapacity", "int", "0"}, {"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=100001, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinit...#203#940093525", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:13>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"4999968", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:2>", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-10000000", "<sample:6>", "<sample:7>", "<sample:10>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:5>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"4999909", "<sample:6>", "<sample:4>", "<sample:6>", "<sample:0>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-44", "<sample:1>", "<sample:7>", "<sample:6>"}}), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-44, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1032", "<sample:4>", "<sample:3>", "<sample:12>"}, false, 4, new String[][]{}), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1032, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483645", "<sample:4>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483645, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"231073", "<sample:7>", "<sample:5>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=231073, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:6>", "<sample:1>", "<sample:13>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity, -Infinity], getPointRef=[Infinity, -Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[Infinity, -Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-482", "<sample:6>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-482, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1", "<sample:5>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438612", "<sample:1>", "<null>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1000", "<sample:2>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "54", "<sample:6>", "<sample:2>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1000, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:3>", "<sample:1>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1438542, getStartPoint=[Infinity, -Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:2>", "<sample:3>", "<sample:12>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0], getPointRef=[1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1073741823", "<sample:6>", "<sample:0>", "<null>", "<sample:2>", "<sample:10>"}}), new String[][]{{"clone", "", "7"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "2877089", "<sample:4>", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:7>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:6>", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000000, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"16777221", "<sample:6>", "<sample:10>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=16777221, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2097151", "<sample:5>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2097151", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2097151, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1033", "<sample:1>", "<null>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5", "<sample:1>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=5, getStartPoint=[], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:7>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:0>", "<sample:2>", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=100000, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:1>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-16743447", "<sample:2>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-16743447, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "22", "<sample:2>", "<sample:0>", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=22, getStartPoint=[-1.0, 0.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "7"}, {"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-10", "<sample:1>", "<sample:7>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-10, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:1>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"getKey", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"21", "<sample:2>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 1), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=21, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:4>", "<sample:4>", "<sample:11>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]...#201#-1992076026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"9", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:11>", "<sample:9>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2058", "<sample:5>", "<sample:3>", "<null>", "<sample:15>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1", "<sample:2>", "<sample:9>", "<sample:8>", "<sample:5>", "<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:7>", "<sample:6>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-4", "<sample:2>", "<null>", "<sample:8>", "<sample:5>", "<empty>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1073741823", "<sample:5>", "<sample:2>", "<sample:14>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[-Infinity, -1.0, 0.0], getUpperBound=[Infinity, Infinity, Infinit...#203#-2007752320", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"16", "<sample:4>", "<sample:0>", "<sample:12>"}, false, 0, null, 2), new String[][]{{"getSecond", "", "6"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=17, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=16, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-26", "<sample:3>", "<sample:5>", "<sample:12>", "<sample:12>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100058", "<sample:3>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=100058, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"995", "<sample:1>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=995, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isEmpty", "", "1"}, {"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "964", "<sample:3>", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -1.0], getMaxEvaluations=964, getStartPoint=[-Infinity, -1.0], getUpperBound=[1.0, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438561", "<sample:3>", "<sample:4>", "<sample:0>"}}), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438561, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1075180366", "<sample:7>", "<sample:1>", "<sample:17>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1075180366, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#138619822", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2), new String[][]{{"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:10>", "<sample:0>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "2"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:0>", "<sample:6>"}}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2499984", "<sample:4>", "<sample:0>", "<sample:12>"}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2499984, getStartPoint=[1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:10>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "9999999", "<sample:2>", "<sample:1>", "<sample:12>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:9>", "<sample:0>", "<sample:8>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, In...#208#919212172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-267716314", "<sample:3>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-267716314, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999988", "<sample:5>", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999988, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:5>", "<sample:7>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=[1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1064", "<sample:4>", "<sample:8>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1064, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100129", "<sample:1>", "<sample:2>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=100129, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-132779186", "<sample:0>", "<sample:11>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-132779186, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100058", "<sample:0>", "<sample:6>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "16", "<sample:7>", "<sample:8>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438543", "<sample:3>", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438543, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000001", "<sample:3>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483647", "<sample:2>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:8>", "<sample:3>"}}, 1), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:4>", "<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:0>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
}
