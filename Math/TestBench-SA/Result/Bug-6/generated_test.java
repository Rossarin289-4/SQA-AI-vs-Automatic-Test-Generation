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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optim.SimpleValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=1.0, getRelativeThreshold=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<empty>", "1.0E-11"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"add", "java.lang.Object", "2"}, {"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:5>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:4>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "179820.45599999998"}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getTarget", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getRMS", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", ""}}, 3), new String[][]{{"add", "java.lang.Object", "2"}, {"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeResiduals", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", "double[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveGradient", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:6>"}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "incrementIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.BaseOptimizer", "getIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=2, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"1438542"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=2.069403085764E12, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!N...#277#1045191589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"143854.2"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=2.0694030857640003E10, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarge...#281#-762340864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"14385.420000000002"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=2.0694030857640004E8, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget...#280#-2062137804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"14385.820000000002"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=2.0695181707240003E8, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget...#280#-73668065", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"14385.820000000003"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=2.069518170724001E8, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=...#279#-232457257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeJacobian", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<empty>", "-2.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:4>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<empty>", "1438542"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getChiSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.BaseOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", "double[],double", "<sample:0>", "1.0E7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=2, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1153595511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveGradient", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.BaseOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getLowerBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getStartPoint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#2005338909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getGoalType", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "incrementIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", ""}}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"add", "java.lang.Object", "2"}, {"trimToSize", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeResiduals", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getTargetSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getWeightSquareRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsMeanHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsMeanHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeWeightedJacobian", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeResiduals", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getStartPoint", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getLowerBound", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getUpperBound", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getStartPoint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1000.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1000000.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-608564422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"999.9999999999999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=999999.9999999998, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!N...#277#-1015642956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1002.7999999999998"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1005607.8399999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!...#278#354026307", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"2005.5999999999997"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4022431.359999999, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!N...#277#1925724902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"2005.9799999999998"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4023955.760399999, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!N...#277#-129623508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsMeanHistory", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", ""}}), new String[][]{{"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsMeanHistory", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=2, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}, {"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getLowerBound", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeJacobian", "double[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsDHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1309150394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "setCost", new String[]{"double"}, new String[]{"100000.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0E10, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerE...#266#-1061062554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=2, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getGoalType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.BaseOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsFitnessHistory", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStartPoint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeCovariances", "double[],double", "<null>", "2.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getStartPoint", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPo...#272#-1440495778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", "double[],double", "<sample:1>", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", "double[],double", "<sample:1>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", "double[],double", "<sample:3>", "2.1474836469999998E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", "double[],double", "<sample:3>", "2.1474836469999998E9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPo...#272#-1820070336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPo...#272#-1820070336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 30, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeResiduals", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=!NullPointerException, getGoalType=null, getIterations=!NullPointerException, getLowerBound=null, getMaxEvaluations=!NullPointerException, getMaxIterations=!NullPointerException, getSt...#234#-1913011224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getGoalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "parseOptimizationData", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStatisticsSigmaHistory", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<null>", "1.0E-15"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "parseOptimizationData", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.BaseOptimizer", "org.apache.commons.math3.optim.linear.SimplexSolver", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.BaseOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.BaseOptimizer", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getGoalType=null, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getStartPoint=null, getUpperBound=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "getIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1319119046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", "double[],double", "<sample:0>", "-0.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", "double[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1422760889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=2147483647, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#1288178200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", "getEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
