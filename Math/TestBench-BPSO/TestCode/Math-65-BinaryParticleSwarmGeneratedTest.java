package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:0>", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:4>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=4, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:6>", "<sample:1>"}, false, 3, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!OptimizationException, getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"4132"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=4132, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<null>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-41"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-41, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<sample:4>", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<null>", "<sample:2>", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<empty>", "<null>", "<null>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2038"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2038, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<empty>", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<sample:4>", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-61404"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-61404, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:10>", "<sample:0>", "<null>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1073741823, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-8388509"}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-8388509, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-15"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-15, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"50"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=50, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "101"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=-2147483647, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483564"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483564, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-33"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-33, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"8388608"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=8388608, getMaxIterations=2, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<null>", "<sample:4>", "<sample:3>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483646"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"65435"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=65435, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:8>", "<empty>", "<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "4132"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<null>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"4082"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4082, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<empty>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"101"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<sample:1>", "<sample:0>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2038"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=99, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"62"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=62, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483646, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "200"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=200, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:4>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"65"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=65, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:10>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-8388509"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"99"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "4147"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=99, getMaxIterations=4147, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"101"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=101, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-10"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=30, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:2>", "<sample:2>", "<empty>", "<sample:4>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "58720355"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=58720355, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:3>", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:1>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-8388453"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-8388453, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=3, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=12, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "101"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-101"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:4>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[1.0, Infinity], getValueRef=[1.0, Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:5>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "198"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("198", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=198, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-19, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:3>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[0.0]], getEvaluations=3, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "16777216"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-10, getMaxIterations=16777216, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:3>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN, NaN], getPointRef=[NaN, NaN], getValue=[-Infinity], getValueRef=[-Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-16777018"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777018", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-16777018, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:9>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "128"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=128, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483638"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483638, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:0>", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"130"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=130, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:13>", "<sample:1>", "<sample:4>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<null>", "<null>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "1073741823"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=1073741823, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"34834"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=34834, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483617"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483617, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "1"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-64"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-64, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=10, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "0"}, {"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-8388509"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8388509", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-8388509, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"101"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=101, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxEvaluations", new String[]{"int"}, new String[]{"50"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=50, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "0"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=0, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:10>", "<sample:4>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2097051"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=2097051, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:1>", "<sample:4>", "<sample:3>", "<sample:1>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:3>", "<sample:0>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-62"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-62, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"101"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=101, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483646"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-8388485"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8388485", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-8388485, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2049"}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.VectorialPointValuePair,org.apache.commons.math.optimization.VectorialPointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2049, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=4, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-1024"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-1024, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:0>", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=-1.0, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:12>", "<sample:3>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=10, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:3>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>", "<sample:4>"}, false), new String[][]{{"getValueRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:8>", "<sample:2>", "<empty>", "<null>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-100"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[NaN]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=4, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleVectorialValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=100, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=2, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:6>", "<sample:3>", "<sample:0>", "<sample:3>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=-Infinity, getCovariances=[[NaN]], getEvaluations=2, getIterations=3, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"143"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=143, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-8388505"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[0.0]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "40"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=[[NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=40, getRMS=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[]", "<sample:4>", "<sample:3>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!FunctionEvaluationException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "4132"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=4132, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483646"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483646, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "<sample:1>"}, false, 0, null, 2), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "4160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=4160, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setConvergenceChecker", "org.apache.commons.math.optimization.VectorialConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "2147483518"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483518, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[0.0]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction", "double[]", "double[]", "double[]"}, new String[]{"<sample:9>", "<sample:0>", "<sample:3>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.VectorialPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN, NaN], getPointRef=[NaN, NaN], getValue=[-Infinity], getValueRef=[-Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getIterations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "50"}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=50, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "-4132"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=-4132, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math.optimization.general.GaussNewtonOptimizer", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.VectorialConvergenceChecker"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getIterations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getMaxIterations=100, getRMS=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
}
