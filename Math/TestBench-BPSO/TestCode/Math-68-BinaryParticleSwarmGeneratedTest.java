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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}}), new String[][]{{"getValueRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-2.0"}}), new String[][]{{"getValueRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!OptimizationException, getEvaluations=2, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:9>", "<sample:3>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "16"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:10>", "<sample:1>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[1.0]], getEvaluations=35, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.7071067811865476}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:10>", "<sample:7>", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!NullPointerException, getEvaluations=40, getIterations=40, getJacobianEvaluations=41, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"40.5001"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"24.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-123"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-0.75"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.7499999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "11"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=11, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-4.599900000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-4.1999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:1>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "100"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.25"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=3, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "Infinity"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "1.0E-4"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "0.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:2>", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"4194378"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4194378, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-0.1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.6"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "10.000000000000002"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:4>", "<empty>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<empty>", "<empty>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"9"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-99"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "101"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-99, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "16386"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=16386, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:1>", "<sample:1>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=5, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2097165"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2097165, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<empty>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"16777216"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=16777216, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-0.75"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.10000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "612"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=612, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-59"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "2.2204E-16"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<null>", "<null>", "<empty>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "0.49999999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-0.1699999999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"15"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=15, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "54"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=54, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<empty>", "<sample:3>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "-111.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "2.2251E-308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:0>", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2046"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2046, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"153"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=153, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-0.001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-24"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-24, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1073741824, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "51"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=51, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-2.2"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-30, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "Infinity"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-10.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "202"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=202, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=11, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "101"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"100"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.0601"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-1048675"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1048675, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"32.0"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.032100000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "0.0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.1"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "8201"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=8201, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"99.2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"0.05000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:0>", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"1.0E-5"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"0.002"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "50"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=50, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483592"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483592, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:2>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2147483594"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483594, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "-0.429"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:0>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-134217730"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-4195"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-134217730, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"100.47"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "18"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "1.0E-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=18, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.001"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:1>", "<null>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"2.2251E-308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "33554431"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=33554431, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "26"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=26, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "9.999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<empty>", "<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.001"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "-1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "404"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("404", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=404, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.049"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<empty>", "<sample:1>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<empty>", "<empty>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "184"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("184", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=184, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "16777226"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=16777226, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "24"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=24, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-1.0"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "65545"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65545", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=65545, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483392"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483392", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483392, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-29"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-29, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"4194314"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=4194314, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "1.0E-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:5>"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-1.0E-10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"1.11255E-308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "7"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=7, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=32, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "-2"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<null>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:0>", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:3>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-10, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"200"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "1073741873"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=200, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-63477"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-63477, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=9, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<null>", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:4>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<null>", "<empty>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2048"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", "double", "20.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2048, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "34"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=34, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "18"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=18, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"-44.006999999899996"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:3>", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:2>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", "double", "2.2251E-308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setParRelativeTolerance", new String[]{"double"}, new String[]{"0.27001000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "-16381"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-16381, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "67108864"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", "double", "5.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=67108864, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setInitialStepBoundFactor", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"129.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-4"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-4, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxEvaluations", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=5, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setOrthoTolerance", new String[]{"double"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<empty>", "<empty>", "<empty>"}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<empty>", "<empty>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setCostRelativeTolerance", new String[]{"double"}, new String[]{"5.0E-4"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1000, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "setMaxIterations", "int", "49"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=49, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
}
