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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:6>", "<sample:0>", "<sample:4>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:2>", "<sample:4>", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getRMS=NaN, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483646", "<sample:6>", "<sample:0>", "<sample:9>", "<sample:3>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "36", "<sample:7>", "<sample:0>", "<sample:3>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:3>", "<sample:9>", "<sample:7>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTarget", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "1.0"}}), new String[][]{{"getSecond", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"10", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"5", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"28", "<sample:4>", "<empty>", "<sample:0>", "<empty>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:0>", "Infinity"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "NaN"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:2>", "<sample:4>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<null>", "<sample:4>", "<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getRelativeThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "-1.7976931348623157E308"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:7>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:9>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0E-14"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0E-28, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=7.071067811865475E-15, getStartPoint=[], getTarg...#221#434519367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:1>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0E-14"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-257", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#-501085039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "1791", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1791, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#672800378", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1791", "<sample:2>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1791, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExc...#207#-780675383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "4"}, {"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "Infinity"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "Infinity"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1", "<sample:6>", "<sample:0>", "<null>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2", "<null>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:2>", "<sample:5>", "<sample:1>", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-257", "<null>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-257", "<null>", "<sample:4>", "<sample:0>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"128", "<null>", "<sample:1>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-1", "<sample:6>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<sample:2>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<null>", "<sample:2>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:3>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483609", "<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<null>", "<sample:1>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<null>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483609", "<sample:5>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<null>", "<sample:2>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<null>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<null>", "<empty>", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget...#223#-1505135218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4.000000000000002, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=...#222#1513009445", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"-9.999999999999998E-15"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1", "<sample:1>", "<sample:1>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<empty>", "<sample:7>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:3>", "<null>", "<sample:7>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:3>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:3>", "<empty>"}}, 1), new String[][]{{"value", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:4>", "<empty>"}}, 1), new String[][]{{"value", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"1073741795", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:6>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<null>", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<null>", "Infinity"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=3, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-849264410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-257", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "10", "<sample:1>", "<sample:1>", "<empty>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"10", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"10", "<sample:5>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<sample:4>", "<sample:0>", "<null>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<sample:4>", "<sample:0>", "<null>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "0.0"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=3, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-849264410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1091822764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1091822764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:7>", "<null>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "-1.0"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:7>", "<empty>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "-1.0"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#297888747", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:5>", "<sample:1>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<null>", "<null>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:5>", "<null>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "1", "<sample:3>", "<sample:4>", "<empty>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "1", "<sample:3>", "<sample:4>", "<empty>", "<sample:4>"}}), new String[][]{{"value", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "1", "<sample:3>", "<sample:4>", "<null>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-257", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:0>", "1.0E-14"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:4>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<empty>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<empty>", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:4>", "<sample:7>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:7>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:4>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1", "<sample:2>", "<sample:2>", "<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-257", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#-501085039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"1.0E-14"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:0>", "<sample:7>", "<empty>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<null>", "<sample:1>", "<sample:1>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=0.0, getStartPoint=[1.0, Infinity], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<null>", "<sample:1>", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=0.0, getStartPoint=[1.0, Infinity], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"10", "<sample:0>", "<sample:1>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:4>", "<null>", "<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "10", "<sample:2>", "<sample:2>", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"2147483647", "<sample:5>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:1>", "<empty>", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:7>", "<empty>", "<sample:1>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:2>", "<sample:1>"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:4>", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[], getTarget=[1.0, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-257", "<null>", "<sample:2>", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-257", "<sample:1>", "<sample:4>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-257", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=0.0, getStartPoint=[0.0, 1.0], getTarget=[-Infinity, -1.0]...#201#1831903574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<null>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<null>", "<empty>", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:2>", "<sample:1>", "<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#-710509528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#371298759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<sample:2>", "<sample:7>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=-257, getRMS=Infinity, getStartPoint=[1.0, Infinity], getTarget=[1.0, Infini...#215#559963227", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=-257, getRMS=Infinity, getStartPoint=[1.0, Infinity], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-257", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#-501085039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#-783919540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<null>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1091822764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1005899752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1005899752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1453224697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:7>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:6>", "<sample:0>"}}), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"getAbsoluteThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}), new String[][]{{"getAbsoluteThreshold", "", "1"}, {"getAbsoluteThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:2>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}), new String[][]{{"value", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"3.5400000000000005"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:2>", "<null>", "<sample:6>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:7>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1180921434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:6>", "<empty>", "<sample:4>", "<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-257", "<sample:7>", "<empty>", "<empty>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:6>", "<sample:2>", "<sample:5>", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:0>", "<sample:2>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<null>", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:3>", "<sample:2>", "<sample:4>", "<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<null>", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483630", "<sample:5>", "<sample:7>", "<null>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:3>", "<sample:0>", "<null>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<null>", "<null>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:5>", "<sample:8>", "<sample:1>", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<sample:0>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:6>", "<sample:2>", "<null>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"260046862", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483391", "<sample:2>", "<sample:0>", "<sample:6>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "1", "<sample:6>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#299433028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<null>", "<empty>", "<sample:11>", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483390", "<sample:2>", "<sample:0>", "<sample:6>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-257", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#-501085039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:0>", "<sample:7>", "<sample:1>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<sample:2>", "<sample:4>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483390", "<sample:2>", "<sample:0>", "<sample:6>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:6>", "<sample:1>", "<sample:7>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-257", "<sample:0>", "<sample:7>", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:7>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[-1.0], getTarget=[1.0, Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:6>", "<sample:9>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:6>", "<sample:9>", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=[[NaN, NaN], [NaN, NaN]], getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=0.0, getStartPoint=[1.0, Infinity], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:6>", "<sample:9>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=[[NaN]], getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=0.0, getStartPoint=[-1.0], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:1>", "<sample:9>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!DimensionMismatchException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=0.0, getStartPoint=[-1.0], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "1", "<sample:6>", "<sample:9>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=2, getMaxEvaluations=1, getRMS=0.0, getStartPoint=[-1.0], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-1", "<sample:7>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[-Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[-1.0], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[-Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:7>", "<sample:0>", "<sample:3>", "<sample:4>"}}), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[1.0], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:0>", "<empty>", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[-Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:0>", "<empty>", "<sample:2>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[0.0], getValueRef=[0.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=Infinity, getStartPoint=[-Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-257", "<sample:6>", "<sample:3>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:0>", "<empty>", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<null>", "<sample:1>", "<null>", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:1>", "<empty>"}}), new String[][]{{"value", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1453224697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:1>", "<empty>"}}, 3), new String[][]{{"value", "double[]", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1453224697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:9>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:9>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<empty>", "<empty>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:9>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-257", "<sample:2>", "<empty>", "<empty>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-257, getRMS=NaN, getStartPoint=[-1.0, 0.0], getTarget=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "4.9E-324"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:4>", "<empty>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "6"}, {"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "4.9E-324"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-2147483648", "<sample:1>", "<sample:9>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:4>", "<empty>"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "5"}, {"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=[-1.0], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<sample:1>", "<sample:0>", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=[-1.0], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:11>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "2147483646", "<sample:3>", "<sample:3>", "<sample:1>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:3>", "<sample:2>", "<sample:9>", "<sample:9>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:5>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[1.0, Infinity, -In...#208#-1254096339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "1", "<sample:7>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#240212291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:6>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<null>", "<null>", "<sample:1>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#-783919540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.25, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerE...#209#-80463312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-8.54"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=72.93159999999999, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=...#222#-1075996754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483647", "<sample:6>", "<sample:0>", "<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:6>", "<sample:9>", "<sample:9>", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-56", "<sample:5>", "<sample:4>", "<sample:0>", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:4>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483647", "<sample:0>", "<sample:3>", "<sample:12>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "5.0E-15"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<null>", "1.0E-14"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[1.0, Infinity], getValueRef=[1.0, Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:7>", "<sample:1>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[1.0, Infinity], getValueRef=[1.0, Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[1.0, Infinity], getValueRef=[1.0, Infinity]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483646, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:3>", "<sample:4>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:1>", "<sample:4>", "<sample:4>", "<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483644", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483644, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:3>"}}, 1), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:4>", "<sample:4>", "<null>", "<sample:9>"}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483646", "<sample:7>", "<sample:4>", "<sample:4>", "<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483646", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2", "<sample:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:4>", "<sample:10>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[Infinity], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"2147483647", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<null>", "<empty>", "<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<null>", "<empty>", "<sample:2>", "<sample:1>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483647", "<null>", "<sample:1>", "<sample:1>", "<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483646", "<sample:2>", "<sample:7>", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:4>", "<sample:4>", "<sample:7>", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "2147483646", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#116095411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "25", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=25, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1988606037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:0>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=3, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-849264410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:6>", "<null>", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "8.988465674311579E306"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:6>", "<null>", "<sample:4>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483646", "<sample:4>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483646, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#301618380", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#-783919540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#1572508459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:7>", "<sample:3>", "<sample:1>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483646", "<sample:2>", "<sample:3>", "<sample:1>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483646, getRMS=NaN, getStartPoint=[-Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:0>", "<sample:1>"}}), new String[][]{{"value", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483593", "<sample:0>", "<sample:1>"}}), new String[][]{{"value", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483593, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1023174213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483593", "<sample:4>", "<sample:1>"}}), new String[][]{{"value", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483593, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1023174213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483593", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"value", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483593, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1023174213", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:7>", "<sample:0>", "<empty>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483593", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 3), new String[][]{{"value", "double[]", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-2147483593, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#945183942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:7>", "<sample:0>", "<empty>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483593", "<null>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 3), new String[][]{{"value", "double[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:7>", "<sample:0>", "<empty>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:9>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[-1.0], getTarget=[1.0, Infinity, -Infinity...#202#583430315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:9>", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerEx...#208#-783919540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.25, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointerE...#209#-80463312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.25"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0625, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPointe...#211#902123050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#-1985129240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
