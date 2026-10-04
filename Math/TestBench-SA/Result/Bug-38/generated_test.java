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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"251", "<sample:1>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:4>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1073741824", "<sample:17>", "<sample:5>", "<sample:1>", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:5>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483611, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1925712329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:5>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:17>", "<sample:5>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741776", "<sample:1>", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741776, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#-1064775417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:11>", "<sample:5>"}}), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-11.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:3>", "<sample:6>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "536870900", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"268435448", "<sample:3>", "<sample:0>", "<sample:7>", "<sample:10>", "<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "520093684", "<sample:7>", "<sample:4>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"251", "<sample:1>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2050", "<sample:5>", "<sample:5>", "<sample:2>", "<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:5>", "<sample:5>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:5>", "<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"82", "<sample:5>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"0", "<sample:5>", "<sample:0>", "<empty>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"249", "<sample:13>", "<sample:4>", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"32", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"3", "<sample:7>", "<null>", "<null>", "<sample:1>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:3>", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1", "<sample:3>", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:5>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:5>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:2>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1", "<sample:7>", "<sample:3>", "<sample:0>", "<sample:1>", "<empty>"}}, 2), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1", "<sample:7>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:4>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-1", "<sample:8>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "939524094", "<sample:4>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1073741776", "<sample:6>", "<sample:5>", "<sample:1>", "<null>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073709008", "<sample:4>", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "249", "<sample:7>", "<sample:7>", "<sample:2>", "<null>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483639", "<sample:4>", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:5>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 2), new String[][]{{"getRelativeThreshold", "", "6"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870902", "<sample:5>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870902, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-1723922358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870902", "<sample:5>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:0>", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<null>", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:6>", "<sample:7>", "<sample:2>"}}, 3), new String[][]{{"getValue", "", "1"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:6>", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"getValue", "", "1"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:0>", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-9.0, Infinity, -Infinity], getPointRef=[-9.0, Infinity, -Infinity], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:0>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536871412", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 2), new String[][]{{"getValue", "", "2"}, {"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536871412, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-434367329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:1>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getValue", "", "4"}, {"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-9.0, Infinity, -Infinity], getPointRef=[-9.0, Infinity, -Infinity], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:1>", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "16", "<sample:4>", "<null>", "<empty>", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"getValue", "", "5"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#287527064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741800", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "16", "<sample:4>", "<null>", "<empty>", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"getValue", "", "5"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741800, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#81821797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3), new String[][]{{"getValue", "", "5"}, {"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 2), new String[][]{{"getValue", "", "5"}, {"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741800", "<sample:1>", "<sample:3>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}}, 2), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741800, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#81821797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483617", "<sample:3>", "<null>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"939524094", "<null>", "<sample:6>", "<null>", "<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "16", "<null>", "<sample:1>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"502", "<sample:1>", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-1", "<sample:4>", "<sample:4>", "<sample:1>", "<null>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:4>", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=536870900, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "11", "<sample:17>", "<sample:1>", "<sample:0>", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "11", "<sample:17>", "<sample:1>", "<sample:0>", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=11, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "22", "<sample:17>", "<sample:1>", "<sample:0>", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=22, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"251", "<sample:5>", "<sample:7>", "<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"939524094", "<sample:17>", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"939524094", "<sample:17>", "<null>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:5>", "<null>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:5>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"251", "<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2", "<sample:5>", "<sample:6>", "<sample:2>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"9", "<sample:0>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:1>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=3, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-3", "<sample:0>", "<null>", "<sample:1>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-3", "<sample:0>", "<null>", "<sample:1>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"3", "<sample:5>", "<null>", "<null>", "<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:3>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:3>", "<sample:6>", "<sample:1>"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-1, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:3>", "<sample:6>", "<sample:3>"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0], getValue=-0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=17, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:2>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:5>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:4>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=249, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:5>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1", "<sample:7>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "250", "<sample:2>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("250", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=250, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "250", "<null>", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:1>"}}), new String[][]{{"getAbsoluteThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"getRelativeThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1", "<sample:0>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:4>", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=1073741823, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "0", "<sample:5>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "11", "<sample:1>", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:17>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2147483648, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483636", "<sample:0>", "<sample:7>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:3>", "<sample:5>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:6>", "<sample:7>", "<sample:2>"}}), new String[][]{{"getValue", "", "1"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:3>", "<sample:5>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:6>", "<sample:7>", "<sample:2>"}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:7>", "<sample:2>"}}), new String[][]{{"getValue", "", "1"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#287527064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:6>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-9.0, Infinity, -Infinity], getPointRef=[-9.0, Infinity, -Infinity], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-970635782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870933", "<sample:0>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-9.0, Infinity, -Infinity], getPointRef=[-9.0, Infinity, -Infinity], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870933, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-1065913958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:0>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, NaN, NaN], getPointRef=[1.0, NaN, NaN], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870900, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#693981708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "0", "<sample:6>", "<sample:7>", "<sample:2>"}}), new String[][]{{"getAbsoluteThreshold", "", "0"}, {"getRelativeThreshold", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:0>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483617, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#1243329790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870961", "<sample:1>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-9.0, Infinity, -Infinity], getPointRef=[-9.0, Infinity, -Infinity], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870961, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-1558882913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:3>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741824, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870900", "<sample:4>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=536870900, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "22", "<sample:17>", "<sample:1>", "<sample:0>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=22, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:6>", "<sample:0>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=-2147483648, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:5>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1073741824, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741869", "<sample:5>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=1073741869, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<null>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:6>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=3, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2", "<sample:0>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:2>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=9, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "2"}, {"getRelativeThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1073741794", "<sample:0>", "<sample:5>", "<empty>", "<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-262145", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:6>", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-262145", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:6>", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-262145", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-262145", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:7>", "<sample:2>"}}, 2), new String[][]{{"getValue", "", "1"}, {"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#287527064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<null>", "<sample:6>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-1", "<sample:7>", "<sample:2>", "<sample:2>", "<null>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483636", "<sample:5>", "<sample:3>", "<sample:1>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741539", "<sample:5>", "<sample:0>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "1073741760", "<sample:17>", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:5>", "<sample:4>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "0", "<sample:7>", "<null>", "<null>", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=249, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:11>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 1), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-11.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:11>", "<sample:5>"}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-11.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:0>", "<sample:11>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-11.0, 0.0, 1.0], getPointRef=[-11.0, 0.0, 1.0], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870911", "<sample:0>", "<sample:11>", "<sample:5>"}}, 3), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-11.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870911, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:3>", "<sample:11>", "<sample:5>"}}, 3), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:0>", "<sample:11>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483646", "<sample:0>", "<sample:11>", "<sample:5>"}}, 1), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-11.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=12, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483646, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:1>", "<sample:6>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483617, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483636", "<sample:17>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"11", "<sample:6>", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1348769554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1592306417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "17", "<sample:3>", "<sample:6>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=17, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:6>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"28", "<sample:7>", "<sample:1>", "<sample:8>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity, -Infinity, -1.0], getPointRef=[Infinity, -Infinity, -1.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=28, getStartPoint=[Infinity, -Infinity, -1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"28", "<sample:7>", "<sample:1>", "<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0, Infinity], getPointRef=[0.0, 1.0, Infinity], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=28, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"68", "<sample:7>", "<sample:0>", "<sample:11>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0, Infinity], getPointRef=[0.0, 1.0, Infinity], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=68, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"68", "<sample:7>", "<sample:0>", "<sample:11>"}, false, 9, new String[][]{}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=68, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"136", "<sample:7>", "<sample:0>", "<sample:11>"}, false, 9, new String[][]{}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=136, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"136", "<sample:7>", "<sample:0>", "<sample:11>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"136", "<sample:6>", "<sample:0>", "<sample:11>"}, false, 9, new String[][]{}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=136, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"136", "<sample:6>", "<sample:3>", "<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2", "<sample:6>", "<sample:11>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:5>", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=136, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:6>", "<sample:0>", "<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:5>", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"8388744", "<sample:6>", "<sample:3>", "<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-3", "<sample:5>", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=8388744, getStartPoint=[0.0, 1.0, Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:2>", "<sample:8>", "<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:6>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:6>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:6>", "<sample:7>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:6>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "3", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:1>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[0.0, 1.0], getMaxEvaluations=3, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "6", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=6, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3), new String[][]{{"getRelativeThreshold", "", "5"}, {"getAbsoluteThreshold", "", "1"}, {"getAbsoluteThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:7>", "<sample:11>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483611, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "11", "<sample:5>", "<sample:4>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-3", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=11, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "11", "<sample:5>", "<sample:4>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-3", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=11, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:7>", "<sample:5>", "<null>", "<sample:5>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "536870854", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=536870854, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "536870854", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=536870854, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:2>", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870911", "<sample:5>", "<sample:4>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870911, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "536870911", "<sample:5>", "<sample:4>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=536870911, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "268435471", "<sample:5>", "<sample:5>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=268435471, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:4>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=39, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:4>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:4>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=11, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:4>", "<sample:5>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:4>", "<sample:5>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "250", "<sample:2>", "<sample:0>", "<empty>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "458", "<sample:4>", "<sample:11>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:0>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:2>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "430", "<sample:4>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=34, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=430, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:2>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "430", "<sample:4>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=430, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2147483648", "<sample:2>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "430", "<sample:4>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=430, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "215", "<sample:4>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=38, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=215, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "215", "<sample:4>", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=215, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"0", "<null>", "<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "0", "<sample:4>", "<sample:0>", "<sample:0>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=0, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2188", "<sample:0>", "<sample:0>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:1>", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483611, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741823", "<sample:2>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:1>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=9, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2146435099", "<sample:5>", "<sample:1>", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2146435099, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:6>", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:9>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483647, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:0>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("249", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=249, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:0>", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=29, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:0>", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:0>", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=29, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "251", "<sample:0>", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=251, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"250", "<sample:1>", "<sample:5>", "<sample:0>", "<null>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"500", "<sample:3>", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:5>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"getAbsoluteThreshold", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"536870888", "<sample:3>", "<sample:0>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=18, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:5>", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:17>", "<null>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:17>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:5>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:17>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:10>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}, {"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:17>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:10>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}, {"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-3", "<sample:0>", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[1.0, Infinity, -Infinity], getMaxEvaluations=-3, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483611", "<null>", "<sample:3>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2147483636", "<sample:5>", "<sample:5>", "<sample:1>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"251", "<sample:4>", "<sample:3>", "<sample:2>", "<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-1073742335", "<sample:2>", "<sample:4>", "<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:1>", "<sample:2>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741771", "<sample:1>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741771, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741771", "<sample:1>", "<sample:2>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741771, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:2>", "<sample:7>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741771", "<sample:1>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741771, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2), new String[][]{{"getAbsoluteThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "249", "<sample:5>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=249, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-1", "<sample:7>", "<null>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "537133044", "<sample:17>", "<sample:6>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=34, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=537133044, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "537133044", "<sample:17>", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=537133044, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "537132788", "<sample:17>", "<sample:6>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=34, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=537132788, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "537132788", "<sample:17>", "<sample:6>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=537132788, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "285", "<sample:5>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483636", "<sample:7>", "<sample:0>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#1687600447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2", "<sample:4>", "<sample:11>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741812", "<sample:4>", "<sample:6>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483603", "<sample:7>", "<sample:5>", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[], getMaxEvaluations=2147483603, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:2>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "939524094", "<sample:0>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483611, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-29357966", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:2>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "939524094", "<sample:0>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483611, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-559979211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getUpperBound", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483611", "<sample:2>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "939524094", "<sample:0>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483611, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#694802806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"18", "<sample:3>", "<sample:4>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "2", "<sample:6>", "<sample:7>", "<sample:0>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2, getStartPoint=[-1.0], getUpperBound=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getLowerBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "3", "<sample:0>", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "67", "<sample:0>", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"getAbsoluteThreshold", "", "7"}, {"getAbsoluteThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=67, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "10", "<sample:4>", "<sample:6>", "<sample:0>", "<sample:0>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=10, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}}, 3), new String[][]{{"getRelativeThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-2", "<sample:1>", "<sample:4>", "<sample:5>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "1073741824", "<sample:17>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1073741824, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483636", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, Infinity, -Infinity], getPointRef=[1.0, Infinity, -Infinity], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#-1466116806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-2147483636", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483636", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 10, new String[][]{}, 2), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#-1466116806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"2147483644", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 10, new String[][]{}, 2), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483644, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, In...#208#-18503747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", new String[]{"int", "org.apache.commons.math.analysis.MultivariateFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"-3", "<null>", "<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483636", "<sample:1>", "<sample:11>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "939524094", "<sample:7>", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"getAbsoluteThreshold", "", "4"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "5"}, {"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483636, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[],double[],double[]", "-3", "<sample:0>", "<sample:6>", "<sample:1>", "<null>", "<null>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-3, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483636", "<sample:5>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483636, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "2147483617", "<sample:3>", "<sample:11>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "-18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getStartPoint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "15", "<null>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=20, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "15", "<null>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "15", "<null>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=19, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "18", "<sample:4>", "<sample:11>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=18, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:4>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=9, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "9", "<sample:4>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=9, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "optimize", "int,org.apache.commons.math.analysis.MultivariateFunction,org.apache.commons.math.optimization.GoalType,double[]", "53", "<sample:4>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("53", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=29, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=53, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
}
