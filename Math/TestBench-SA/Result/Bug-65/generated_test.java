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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<empty>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-100"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:1>", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=4, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-1073741824"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:2>", "<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"100"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"200"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=200, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-200"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-200, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-181"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-181, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-362"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-362, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:3>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483646, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483618"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483618, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483618"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483618, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483597"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483597, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2113929165"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2113929165, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"16777217"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=16777217, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"16777233"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=16777233, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483646, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483610"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483610, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2143289343"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2143289343, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2143289343"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2143289343, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "33554531"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=33554531, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"99"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:1>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-16383"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-16383, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-536870911"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-536870911, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-536739839"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-536739839, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073479678"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1073479678, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483646"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483646, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"54"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=54, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[1.0, Infinity], getValueRef=[1.0, Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=10, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:3>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483646, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-24"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-24, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-24"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-24, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "0"}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "142"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=142, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:2>", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2145386496"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "25"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=25, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-99"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:1>", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:2>", "<sample:2>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:2>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "99"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "86"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=86, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-262045"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-262045, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-262000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-262000, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[0.0]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=100, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[0.0]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=100, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483519"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483519, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-1073741824"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=-1073741824, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-1073741773"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=-1073741773, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "99"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-35"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-35, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[-1.0, 0.0, 1.0], getValueRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[-1.0, 0.0, 1.0], getValueRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>", "<sample:2>", "<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3), new String[][]{{"getValueRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "16385"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=16385, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483646, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<null>", "<sample:1>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:1>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[-1.0, 0.0, 1.0], getValueRef=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN, NaN], getPointRef=[NaN, NaN], getValue=[Infinity], getValueRef=[Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-52"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-52, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-87"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-87", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-87, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-99"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "99"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=99, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "107"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("107", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=107, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "101"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("101", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"100"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"50"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=50, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483646, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:3>", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:3>", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
}
