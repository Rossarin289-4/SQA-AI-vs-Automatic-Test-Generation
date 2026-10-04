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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<sample:3>"}, false, 16, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:6>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.494232837155788E306"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}}), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.0E-4"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-8.988465674311575E305"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-4.494232837155788E306"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.0E-4"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "NaN"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-4.4942328371557875E306"}}, 3), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>", "<empty>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-20.001999999999995"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:12>", "<sample:12>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.0E-4"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:12>", "<empty>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}), new String[][]{{"getValueRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinit...#202#793688142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:12>", "<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-2.910383045673368E-11], getPointRef=[-2.910383045673368E-11], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=[[1.0]], getEvaluations=37, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<empty>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "2.2251E-308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:10>", "<sample:1>", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:12>", "<sample:12>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-0.41000000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "0.1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"500.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1933.2999999999997"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.37499999999999994"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-8.259999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<null>", "<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>", "<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"9"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2041"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2041, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "101"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "101"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1073741823, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "10.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"9"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"21"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=21, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-27"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-27, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"100"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"50"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=50, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"101"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"111"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=111, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"3"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=3, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<empty>", "<sample:1>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:5>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"100.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.5"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-33"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-33, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 25, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:3>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.13305"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=3, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=6, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-65530"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-65530, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"3"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"6"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=6, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"6"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=6, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483593"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483593, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.0E-10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<null>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"2.2204E-16"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"19.369999999999997"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.001"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1073741823, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483646, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"100"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "50"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=50, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-4.4942328371557893E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=11, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:0>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "2.2251E-308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "NaN"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:0>", "<sample:3>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.75"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.75"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:0>", "<empty>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-10.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:3>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<empty>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "100"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.75"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "104"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=47, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=4, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=18, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "101"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"175.88525000000004"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "3"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=3, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"1.0E-4"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.26049999999999995"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "0.10200000000000001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "0.05700000000000001"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"100"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"5.000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<null>", "<sample:1>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>", "<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>", "<empty>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "1.0E-4"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"2.2204E-16"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:3>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:9>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3), new String[][]{{"getValueRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:9>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-1.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:9>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:3>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "0.001"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "0.001"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<empty>"}, false, 9, new String[][]{}, 3), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:3>", "<empty>"}, false, 8, new String[][]{}, 3), new String[][]{{"getValueRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:3>", "<empty>"}, false, 7, new String[][]{}), new String[][]{{"getValueRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:6>", "<empty>"}, false, 8, new String[][]{}, 3), new String[][]{{"getValueRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:6>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:6>", "<sample:6>", "<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:6>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "10.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.25"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 1), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:6>", "<sample:6>", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}}, 3), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 1), new String[][]{{"getValueRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 3), new String[][]{{"getValueRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.4942328371557894E306"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "1.0"}}, 3), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.494232837155789E306"}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.494232837155789E306"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "1.0E-4"}}), new String[][]{{"getValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.494232837155788E306"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.0E-4"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-8.988465674311575E305"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=[-Infinity], getValueRef=[-Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:6>", "<sample:6>", "<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-28.0231"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.4942328371557883E307"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483598"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483598, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2013265870"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2013265870, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2013265870"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2013265870, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=11, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.001"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "100.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-4.4942328371557875E306"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-255"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-255, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-200"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-200, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"830.7669999999998"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-64"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-64, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-128"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-128, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-102"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-102, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"99"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-4.494232837155789E306"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-28.0231"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-1.7976931348623153E306"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "107"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=107, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "107"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<null>", "<empty>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:8>", "<sample:1>", "<sample:3>", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"102.8"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "201"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=201, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-8.988465674311576E304"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:6>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:6>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:6>", "<sample:6>", "<empty>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:6>", "<sample:6>", "<empty>"}}, 1), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
}
