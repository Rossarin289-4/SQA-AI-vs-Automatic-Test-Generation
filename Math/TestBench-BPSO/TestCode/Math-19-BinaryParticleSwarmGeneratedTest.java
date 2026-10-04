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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1007", "<sample:0>", "<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5758229", "<sample:9>", "<sample:5>", "<sample:3>"}}), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=5758229, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438541", "<sample:13>", "<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-99999", "<sample:1>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438541, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1073741823", "<sample:16>", "<sample:6>", "<sample:2>", "<null>", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1073741823, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[1.0, Infinity, -Infinit...#203#-1457972275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-99999", "<sample:4>", "<sample:13>", "<sample:3>", "<sample:0>", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"3", "<sample:6>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:11>", "<sample:5>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1), new String[][]{{"getKey", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[-1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"4067", "<sample:0>", "<sample:4>", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "50004", "<sample:15>", "<sample:9>", "<sample:6>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1073741825", "<sample:4>", "<sample:7>", "<sample:2>", "<sample:5>", "<sample:1>"}}), new String[][]{{"getSecond", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=77, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=4067, getStartPoint=[0.0], getUpperBound=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"134301344", "<sample:9>", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-1.0], getMaxEvaluations=134301344, getStartPoint=[0.0], getUpperBound=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:9>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4067", "<sample:5>", "<sample:8>", "<sample:1>"}}, 2), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"add", "java.lang.Object", "7"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"49999", "<sample:4>", "<sample:11>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000000", "<sample:10>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:6>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"12", "<sample:7>", "<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2877123", "<sample:1>", "<sample:5>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99939", "<sample:2>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99939, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<sample:5>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:6>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "1"}, {"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:7>", "<sample:8>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 2), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:2>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"11", "<sample:6>", "<sample:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:1>", "<sample:12>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2097155", "<sample:10>", "<sample:8>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=999, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:0>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:6>", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1", "<sample:5>", "<sample:6>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"1075180365", "<sample:6>", "<sample:4>", "<sample:2>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:1>", "<null>", "<sample:5>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"200002", "<sample:3>", "<sample:2>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1073741824", "<null>", "<sample:4>", "<null>"}}, 3), new String[][]{{"getSecond", "", "7"}, {"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=200002, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 3), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99999", "<sample:1>", "<sample:8>", "<sample:0>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2002", "<sample:2>", "<sample:6>", "<null>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:8>", "<sample:2>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "6", "<sample:10>", "<sample:2>", "<sample:4>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "50000", "<sample:0>", "<sample:1>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=50000, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000035", "<sample:5>", "<sample:6>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:7>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1000", "<sample:5>", "<sample:7>", "<sample:3>"}}, 1), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:5>", "<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<null>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, Infinity, -Infinity], getPointRef=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 3), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"5", "<null>", "<sample:3>", "<sample:2>", "<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "49999", "<sample:14>", "<sample:1>", "<sample:4>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:4>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483646", "<sample:7>", "<sample:5>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:2>", "<null>", "<sample:6>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:13>", "<sample:16>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"getSecond", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"33554432", "<sample:12>", "<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=33554432, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438542", "<sample:5>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99939", "<sample:1>", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=99939, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity...#202#1003726204", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:13>", "<sample:3>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-999", "<sample:5>", "<sample:11>", "<null>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "719271", "<sample:10>", "<sample:8>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"58", "<sample:11>", "<sample:6>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=58, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000000", "<sample:6>", "<sample:0>", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000000, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"19999998", "<sample:2>", "<sample:4>", "<sample:1>", "<empty>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"3", "<sample:6>", "<sample:8>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "999", "<sample:7>", "<sample:8>", "<sample:1>", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-10000001", "<sample:6>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000000", "<sample:7>", "<sample:8>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:8>", "<sample:1>"}}), new String[][]{{"size", "", "6"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-1", "<sample:6>", "<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99999", "<sample:7>", "<sample:8>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}), new String[][]{{"getRelativeThreshold", "", "0"}, {"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "5"}, {"getAbsoluteThreshold", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"993", "<sample:4>", "<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "58", "<sample:4>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2879130", "<sample:2>", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=58, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147352576", "<sample:1>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"99999", "<sample:8>", "<sample:13>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:5>", "<sample:10>", "<sample:3>"}}), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"16445", "<null>", "<sample:7>", "<null>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:3>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2", "<sample:3>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1", "<sample:2>", "<sample:3>", "<sample:2>"}, false), new String[][]{{"getSecond", "", "2"}, {"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"100000", "<sample:0>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-268434457", "<null>", "<sample:5>", "<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "972", "<sample:4>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:5>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:10>", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2879138", "<sample:2>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483611", "<sample:1>", "<sample:4>", "<sample:0>"}, false), new String[][]{{"getSecond", "", "2"}, {"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483611, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "5"}, {"retainAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99884", "<sample:7>", "<sample:4>", "<sample:1>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99884, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"9999999", "<sample:2>", "<sample:10>", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=9999999, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2877084", "<sample:1>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MINIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2877084, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#728389443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:10>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:0>", "<sample:3>", "<sample:0>"}}), new String[][]{{"getKey", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:7>", "<sample:4>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", ""}}), new String[][]{{"clear", "", "1"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"contains", "java.lang.Object", "7"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"getRelativeThreshold", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "500", "<sample:2>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=500, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:1>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=999, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"27", "<sample:2>", "<sample:7>", "<sample:1>"}, false), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=27, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:6>", "<sample:9>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "49999", "<sample:3>", "<sample:8>", "<sample:0>"}}), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"ensureCapacity", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=49999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "5000012", "<sample:5>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=5000012, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1960", "<sample:7>", "<sample:8>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1960, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:5>", "<sample:0>", "<sample:1>"}}), new String[][]{{"listIterator", "int", "2"}, {"hasPrevious", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10000001", "<sample:0>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:11>", "<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"getSecond", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<sample:1>", "<sample:4>", "<sample:0>"}, false), new String[][]{{"getFirst", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=6, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=5, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:5>", "<sample:10>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "50000", "<sample:6>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=65, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=999, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438543", "<sample:2>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "72108864", "<sample:4>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438543, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438523", "<sample:3>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=1438523, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-10000000", "<sample:6>", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-10000000, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:2>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:5>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=79, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10016385", "<sample:6>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10016385, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:0>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-2147483648", "<sample:6>", "<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483646", "<sample:0>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "2"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2", "<sample:6>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:4>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:3>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:13>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438601", "<sample:10>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "29", "<sample:2>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=29, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:13>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Inf...#207#-155687049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:8>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "536870911", "<sample:1>", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000001", "<sample:0>", "<sample:8>", "<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000001, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "50006", "<sample:10>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50006", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=91, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=50006, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"50050", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:5>", "<sample:2>", "<sample:1>"}}), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=97, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=50050, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000008", "<sample:12>", "<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:16>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"iterator", "", "7"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1045", "<sample:1>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1045, getStartPoint=[0.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99939", "<sample:13>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99939, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "999", "<sample:5>", "<sample:12>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=999, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:10>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2879102", "<sample:0>", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=16, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=2879102, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infin...#205#-850452881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "20", "<sample:7>", "<sample:6>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[], getMaxEvaluations=20, getStartPoint=[], getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483647", "<sample:3>", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"439", "<sample:1>", "<null>", "<sample:4>", "<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "6", "<sample:6>", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=6, getStartPoint=[1.0, Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:13>", "<sample:10>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "30", "<sample:7>", "<sample:13>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=30, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:13>", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=-2147483648, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:0>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438542", "<sample:0>", "<sample:4>", "<sample:4>"}}), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "4", "<sample:0>", "<sample:10>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=4, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "37", "<sample:4>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.GoalType", actual.getClass().getName());
  assertEquals("MAXIMIZE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=37, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:7>", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1438541, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:5>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1004", "<sample:2>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:16>", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "72", "<sample:5>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438541", "<sample:1>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=1438541, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infini...#204#-1950468897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:2>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:7>", "<sample:2>", "<sample:4>"}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1073741823", "<sample:4>", "<sample:3>", "<empty>", "<sample:4>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:1>", "<sample:12>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=18, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2147483647, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:0>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-2147483648, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1007", "<sample:6>", "<sample:7>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-1007, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"52048", "<sample:1>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=52048, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"998", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "100000", "<sample:1>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:3>", "<sample:10>", "<sample:0>"}, false, 4, new String[][]{}, 3), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1073741823", "<sample:4>", "<sample:9>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741823, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2086", "<sample:6>", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-99943", "<sample:3>", "<sample:4>", "<sample:2>"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointValuePair,org.apache.commons.math3.optimization.PointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=-99943, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity, Infinity, Infinit...#203#-509003791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "4"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "134218735", "<sample:4>", "<sample:9>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}), new String[][]{{"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=134218735, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "49999", "<sample:7>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=49999, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<null>", "<sample:3>", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:2>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2", "<sample:0>", "<sample:5>", "<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:7>", "<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2002", "<sample:15>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2002, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-17", "<sample:9>", "<sample:12>", "<sample:1>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=-17, getStartPoint=[0.0, 1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:7>", "<sample:13>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2), new String[][]{{"listIterator", "", "7"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"27", "<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1", "<sample:1>", "<sample:10>", "<empty>"}}, 1), new String[][]{{"getValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=27, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "11267705", "<sample:1>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11267705", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=11267705, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"2000", "<sample:10>", "<sample:4>", "<sample:1>", "<sample:7>", "<empty>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "506", "<sample:1>", "<sample:1>", "<sample:4>", "<sample:3>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1073741861", "<sample:12>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1073741861, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}), new String[][]{{"clone", "", "4"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=26, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438604", "<sample:3>", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=1438604, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "0", "<sample:5>", "<sample:5>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "993", "<sample:5>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=993, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:2>", "<sample:13>", "<null>", "<sample:2>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000001", "<sample:1>", "<sample:3>", "<sample:1>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:4>", "<sample:8>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-Infinity, -1.0], getPointRef=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=4, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"8388628", "<sample:2>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=8388628, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"-261145", "<null>", "<sample:9>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99939", "<sample:9>", "<sample:9>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=99939, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2879130", "<sample:3>", "<sample:6>", "<sample:1>"}, false, 0, null, 1), new String[][]{{"getFirst", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2879130, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "10000046", "<sample:13>", "<sample:3>", "<null>", "<sample:0>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"999", "<sample:11>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=13, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=999, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "9999983", "<sample:2>", "<sample:8>", "<sample:0>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=[-1.0], getMaxEvaluations=9999983, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99919", "<sample:5>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99919, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1438542", "<sample:17>", "<sample:13>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483648", "<sample:13>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2145386495", "<sample:6>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=2145386495, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "10", "<sample:2>", "<sample:10>", "<sample:4>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=10, getStartPoint=[-Infinity, -1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "499", "<sample:16>", "<sample:8>", "<sample:3>"}}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=499, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"10000000", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2", "<sample:0>", "<sample:5>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=10000000, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "58", "<sample:13>", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=58, getStartPoint=[-1.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "-1438555", "<sample:15>", "<sample:6>", "<sample:3>", "<null>", "<sample:3>"}}, 2), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=9, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[0.0, 1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:12>", "<null>", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "9999999", "<sample:2>", "<sample:5>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=9999999, getStartPoint=[0.0], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "33554511", "<sample:4>", "<null>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getConvergenceChecker", ""}}, 1), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"5", "<sample:8>", "<null>", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-2147483632", "<sample:0>", "<sample:7>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1000", "<sample:1>", "<sample:9>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1000, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1439565", "<null>", "<sample:4>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1000", "<sample:4>", "<sample:7>", "<sample:3>"}}, 1), new String[][]{{"listIterator", "", "3"}, {"hasPrevious", "", "2"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"4", "<sample:3>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getGoalType", ""}}, 2), new String[][]{{"getFirst", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getGoalType=MAXIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=4, getStartPoint=[-1.0], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 1), new String[][]{{"add", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-1", "<sample:0>", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=-1, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"1998", "<sample:6>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1001", "<sample:2>", "<sample:5>", "<sample:1>"}}, 2), new String[][]{{"getKey", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity], getMaxEvaluations=1998, getStartPoint=[Infinity], getUpperBound=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2147483647", "<sample:3>", "<sample:5>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=2147483647, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "99986", "<sample:9>", "<sample:13>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99986", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=99986, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1015", "<sample:3>", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"993", "<sample:6>", "<sample:0>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=15, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity, -Infinity], getMaxEvaluations=993, getStartPoint=[-1.0, 0.0, 1.0], getUpperBound=[Infinity, Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "3055", "<sample:18>", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"clear", "", "7"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=3055, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "1438472", "<sample:7>", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1438472", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=1438472, getStartPoint=[-Infinity, -1.0], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "2879258", "<sample:6>", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=MAXIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=2879258, getStartPoint=[Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", ""}}, 1), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "12", "<sample:6>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=!NullPointerException, getMaxEvaluations=12, getStartPoint=[1.0, Infinity, -Infinity], getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getLowerBound", ""}}, 1), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateFunction", "org.apache.commons.math3.optimization.GoalType", "double[]"}, new String[]{"3", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[]", "-49999", "<sample:13>", "<sample:10>", "<sample:1>"}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getGoalType=MAXIMIZE, getLowerBound=[-Infinity, -Infinity], getMaxEvaluations=3, getStartPoint=[Infinity], getUpperBound=[Infinity, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getStartPoint", ""}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getLowerBound=!NullPointerException, getMaxEvaluations=0, getStartPoint=!NullPointerException, getUpperBound=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.direct.CMAESOptimizer", "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.direct.CMAESOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateFunction,org.apache.commons.math3.optimization.GoalType,double[],double[],double[]", "1998", "<sample:3>", "<sample:9>", "<sample:4>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=MINIMIZE, getLowerBound=[-Infinity, -1.0], getMaxEvaluations=1998, getStartPoint=[-Infinity, -1.0], getUpperBound=[1.0, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
}
