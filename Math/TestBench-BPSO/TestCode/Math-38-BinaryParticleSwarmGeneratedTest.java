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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:6>", "<null>", "<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"146", "<sample:8>", "<sample:1>", "<sample:4>", "<sample:3>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:9>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}), new String[][]{{"getRelativeThreshold", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "498", "<sample:1>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=498, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "20", "<sample:7>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=20, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"getAbsoluteThreshold", "", "7"}, {"getAbsoluteThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-250", "<sample:3>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4", "<sample:1>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-3", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=-3, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 1), new String[][]{{"getAbsoluteThreshold", "", "2"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"67", "<sample:8>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-131005", "<null>", "<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"19", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:2>", "<sample:8>", "<sample:4>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:2>", "<sample:1>", "<sample:3>", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:8>", "<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-3", "<sample:6>", "<sample:0>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-262146", "<sample:6>", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:8>", "<sample:6>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<null>", "<sample:10>", "<null>", "<sample:2>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-16777219", "<sample:4>", "<sample:5>", "<sample:2>"}}), new String[][]{{"getRelativeThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-16777219, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infi...#206#-1176298052", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-18", "<sample:1>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"15", "<sample:8>", "<sample:8>", "<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"19", "<null>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "54", "<sample:7>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-16777217", "<sample:2>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"134", "<sample:4>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-268435209", "<sample:6>", "<sample:4>", "<sample:8>"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-268435209, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, In...#208#-739755084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "189", "<sample:9>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-2147483648, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:2>", "<sample:1>", "<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-67", "<sample:1>", "<sample:8>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-536870901", "<sample:7>", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"36", "<sample:9>", "<sample:2>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67108866", "<sample:8>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483647, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-10", "<sample:6>", "<sample:4>", "<sample:2>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "250", "<sample:1>", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"498", "<sample:2>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2", "<sample:7>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:1>", "<null>", "<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "84", "<sample:6>", "<sample:8>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=84, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:4>", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=3, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:4>", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:5>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-3, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:6>", "<sample:10>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=3, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-14", "<sample:6>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-14, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "36", "<sample:3>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=36, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "5", "<sample:7>", "<sample:10>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=5, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"17", "<sample:0>", "<sample:3>", "<sample:5>", "<sample:1>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "19", "<sample:9>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=19, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "11", "<sample:6>", "<sample:5>", "<null>", "<sample:1>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:0>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"32", "<sample:6>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:11>", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getAbsoluteThreshold", "", "4"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:4>", "<sample:10>", "<sample:0>", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-4", "<null>", "<sample:0>", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:8>", "<sample:7>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("249", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=249, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "43", "<sample:5>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=43, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:10>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-88", "<sample:4>", "<sample:2>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getRelativeThreshold", "", "1"}, {"getRelativeThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getAbsoluteThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "61", "<sample:7>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=61, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 3), new String[][]{{"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:6>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=17, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "134", "<sample:6>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=134, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:7>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"125", "<sample:6>", "<sample:9>", "<sample:4>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"11", "<sample:1>", "<sample:2>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "502", "<sample:7>", "<sample:10>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4194301", "<null>", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:5>", "<sample:1>", "<empty>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "996", "<sample:9>", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=996, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"134", "<sample:9>", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:4>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "93", "<sample:0>", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=93, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-524291", "<sample:9>", "<sample:8>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-524291, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-250", "<sample:5>", "<null>", "<sample:0>", "<null>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "64", "<sample:3>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=64, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:0>", "<sample:1>", "<sample:4>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -1.0], getMaxEvaluations=-2147483648, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "65547", "<sample:10>", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=65547, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity...#202#881289735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"18", "<sample:3>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "6", "<sample:5>", "<sample:2>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "61", "<sample:1>", "<sample:4>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=61, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "11", "<sample:8>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=11, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "498", "<sample:9>", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=498, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-21", "<sample:0>", "<sample:4>", "<null>", "<null>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "0", "<sample:7>", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:2>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67", "<sample:9>", "<sample:4>", "<sample:1>"}}, 2), new String[][]{{"getAbsoluteThreshold", "", "7"}, {"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=67, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:3>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:6>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-3, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"507", "<sample:3>", "<sample:2>", "<sample:1>", "<null>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "217", "<sample:7>", "<sample:4>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=217, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "44", "<sample:7>", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=44, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-1604008593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "262646", "<sample:0>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-16776174", "<sample:2>", "<sample:1>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 3), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"getRelativeThreshold", "", "7"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "0", "<sample:5>", "<sample:2>", "<sample:1>", "<null>", "<sample:1>"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "5"}, {"getAbsoluteThreshold", "", "1"}, {"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[0.0, 1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "5", "<sample:5>", "<sample:6>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=5, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"19", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-4", "<sample:3>", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-4, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-5", "<sample:8>", "<sample:11>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-5, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"getRelativeThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 2), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:8>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-262646", "<sample:5>", "<sample:6>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-262646, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "996", "<sample:1>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=997, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=996, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-229358", "<sample:3>", "<sample:7>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-229358, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-4194289", "<sample:10>", "<sample:8>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-4194289, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"293", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:3>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=17, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:3>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "250", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=250, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "0", "<sample:6>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:8>", "<null>", "<null>", "<sample:3>", "<sample:3>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1041", "<sample:7>", "<sample:5>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1041", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1041, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:2>", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:5>", "<sample:7>", "<sample:4>", "<null>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "0", "<sample:0>", "<sample:8>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-250", "<sample:3>", "<sample:4>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-250, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-44", "<sample:3>", "<null>", "<sample:6>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-6", "<sample:5>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-6, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "262646", "<sample:3>", "<sample:8>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=262646, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "498", "<sample:4>", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=498, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2080374805", "<sample:6>", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"16777283", "<sample:9>", "<sample:1>", "<sample:4>", "<sample:4>", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:1>", "<sample:0>", "<sample:6>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "5", "<sample:6>", "<sample:8>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=5, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:5>", "<sample:11>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:3>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-3, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-498", "<sample:4>", "<sample:7>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-32771", "<sample:2>", "<sample:5>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-32771, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:4>", "<sample:11>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "8", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:8>", "<sample:2>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-67", "<sample:3>", "<sample:5>", "<sample:1>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "262646", "<sample:1>", "<sample:7>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=262646, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinit...#203#-909528281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<null>", "<sample:5>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1048587", "<sample:0>", "<sample:7>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1048587, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-9", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "498", "<sample:9>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "19", "<sample:10>", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=19, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4194401", "<sample:9>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN, -1.0], getPointRef=[NaN, -1.0], getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=4194401, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-131", "<sample:9>", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-131, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]...#201#769521579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "19", "<sample:9>", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=19, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:6>", "<null>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-39", "<sample:7>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-39, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-2147483648", "<sample:9>", "<sample:2>", "<sample:1>", "<null>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "8388652", "<sample:3>", "<sample:0>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=8388652, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#-1994363221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "134", "<sample:5>", "<sample:11>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=134, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:7>", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=9, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "16777283", "<sample:8>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=16777283, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "20971617", "<sample:6>", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "14", "<sample:8>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=14, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-498", "<sample:8>", "<sample:0>", "<empty>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:2>", "<sample:3>", "<sample:3>", "<sample:0>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "5", "<sample:11>", "<sample:7>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=5, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "15", "<sample:0>", "<sample:7>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=15, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-312", "<sample:0>", "<sample:10>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-312, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:8>", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=3, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "229", "<sample:5>", "<sample:1>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=229, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4194401", "<sample:4>", "<sample:4>", "<sample:1>"}}), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-10.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=4194401, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-500", "<sample:1>", "<sample:3>", "<sample:1>", "<null>", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "553", "<sample:3>", "<sample:8>", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=553, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:0>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "11", "<sample:4>", "<sample:4>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=11, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "16777283", "<sample:5>", "<sample:4>", "<sample:2>", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=16777283, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "270837", "<sample:5>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("270837", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=270837, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "22", "<sample:5>", "<sample:6>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=22, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:0>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:2>", "<sample:10>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=251, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "16", "<sample:3>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=16, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "374", "<sample:7>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("374", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=374, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-17", "<sample:4>", "<sample:7>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-17, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1", "<sample:6>", "<sample:2>", "<sample:4>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[-Infinity, -1.0], getUpperBound=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:4>", "<sample:5>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "498", "<null>", "<sample:11>", "<sample:4>", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=249, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "16", "<sample:7>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=16, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-4194339", "<sample:3>", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-4194339, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "498", "<sample:5>", "<sample:5>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=498, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-16", "<sample:2>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-16, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "50", "<sample:6>", "<sample:7>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=50, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:7>", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "46", "<sample:1>", "<sample:5>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=46, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-498", "<sample:4>", "<sample:4>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-498", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-498, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67", "<sample:3>", "<sample:7>", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1", "<sample:2>", "<sample:6>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:6>", "<sample:5>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1583368055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483399", "<sample:0>", "<sample:4>", "<sample:1>"}}), new String[][]{{"getValue", "", "7"}, {"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483399, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:9>", "<sample:10>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-349226576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "8388641", "<sample:2>", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=8388641, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#1295246890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67", "<sample:2>", "<sample:8>", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=67, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "144", "<sample:5>", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=145, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=144, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<null>", "<sample:8>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:3>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-249", "<sample:9>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-249", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-249, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-249", "<sample:3>", "<sample:11>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-249, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "195", "<sample:9>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN, -1.0], getPointRef=[NaN, -1.0], getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=195, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-18", "<sample:5>", "<sample:6>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-18, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483647", "<sample:6>", "<sample:2>", "<sample:3>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-88", "<sample:6>", "<sample:1>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-88, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "178", "<sample:10>", "<sample:14>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=178, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483616", "<sample:5>", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483616, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3847", "<sample:1>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0], getValue=-0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=3847, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "33554435", "<sample:1>", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=33554435, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infin...#205#-697129095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1008", "<sample:2>", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1009", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1009, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1008, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "262662", "<sample:9>", "<sample:10>", "<sample:1>"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=262662, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "483", "<sample:5>", "<sample:10>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=483, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483344", "<sample:1>", "<sample:0>", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67", "<sample:4>", "<sample:4>", "<sample:1>"}}), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-10.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=67, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-33554566", "<sample:3>", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-33554566, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4194401", "<sample:6>", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4194401, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "29", "<sample:8>", "<sample:8>", "<sample:4>"}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=29, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "59", "<sample:9>", "<sample:0>", "<sample:1>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:8>", "<sample:1>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=17, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:11>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-Infinity, -1.0], getPointRef=[-Infinity, -1.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=14, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "32", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-10.0, 1.0], getPointRef=[-10.0, 1.0], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=32, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4", "<sample:4>", "<sample:8>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "31", "<sample:8>", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=31, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "4", "<sample:0>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "250", "<sample:2>", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=250, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "80", "<sample:4>", "<sample:11>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("80", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=80, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "49", "<sample:4>", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=50, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=49, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "8", "<sample:4>", "<sample:10>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=8, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "555", "<sample:5>", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=555, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:8>", "<sample:8>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "8", "<sample:9>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MathIllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "125", "<sample:0>", "<sample:0>", "<sample:4>", "<null>", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("126", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=126, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=125, getStartPoint=[-Infinity, -1.0], getUpperBound=[-1.0, 0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "19", "<sample:8>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=19, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "11", "<sample:7>", "<sample:8>", "<sample:5>", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0, 0.0, 1.0], getMaxEvaluations=11, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:10>", "<sample:4>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "16", "<sample:3>", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=16, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:8>", "<sample:5>", "<null>", "<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:6>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:1>", "<sample:5>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
}
