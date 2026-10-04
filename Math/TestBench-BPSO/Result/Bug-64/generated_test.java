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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:10>", "<sample:4>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0], getValue=[-Infinity, -1.0], getValueRef=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<empty>", "<empty>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:10>", "<sample:1>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=[[1.0]], getEvaluations=37, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.7071067811865476}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:10>", "<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:10>", "<sample:7>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<null>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"0.001"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-23"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-23, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:3>", "<sample:1>", "<sample:0>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1073741823, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:1>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<null>", "<null>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-156"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-156, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-99"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-99"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"100.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741823"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1073741823, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-0.52"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-41, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-29"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-29, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.382"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "34"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=34, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"100"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "2.2204E-16"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"4"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=4, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-33"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-33, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-27"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-27, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"-1.0E-323"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "28.1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"50.0"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:0>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"0.6100000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"2.2250738585072014E-308"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-0.9640000000000002"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "202"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=202, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.25"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-5.300000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "-1.0000000000000002E-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "200.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "262144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262144", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=262144, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>", "<sample:0>", "<sample:4>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=27, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.053"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"100"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-67108855"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "-1.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-67108855, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483592"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483592, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.05"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "2.2204E-17"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<null>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-13, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=3, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"7"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=7, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"58"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=58, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"-9.999999999999999E-11"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-100"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-3.599"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483606"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483606, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.56"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:5>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "4194305"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194305", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4194305, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"2.2204E-16"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<null>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "50"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=50, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"202"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=202, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:5>", "<sample:5>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-30"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-30, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-0.34"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483645"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483645, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "0.125"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "37"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=37, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"0.09999999999999999"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "33"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=33, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"10.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-202"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-202, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"0.01"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"3"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=3, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.05"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-612"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-612, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-67108863"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-67108863, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483593"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483593", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483593, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"5.3"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "2.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"22"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=22, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"43"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=43, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<null>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "2.6"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"2.2203999999999998E-16"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "198"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=198, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-64, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=11, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"10.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "100.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"2.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "101"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"9.999999999999998E-11"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "74"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=74, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "51"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=51, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=[0.0, 1.0], getValueRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-9"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.25"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"33.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "134217729"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=134217729, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:6>", "<sample:2>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-1024"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1024, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-27"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-27, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"141"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=141, getMaxIterations=20, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", "double", "72.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-26"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-26, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "0.984"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"-4.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"524286"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=524286, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-6, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "100"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:7>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-9"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"1.0E-4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-16777274"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "5.0E-5"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "1048587"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-16777274, getMaxIterations=1048587, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=9, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.0E-10"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "-63.25"}}), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "268435446"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=268435446, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-10"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", "double", "2.0000000000000004"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.24999999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-100"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setQRRankingThreshold", new String[]{"double"}, new String[]{"0.012"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:1>", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-68"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=-68, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
}
