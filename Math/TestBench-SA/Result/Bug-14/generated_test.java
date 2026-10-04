package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "40.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"preMultiply", "org.apache.commons.math3.linear.RealMatrix", "6"}, {"getFrobeniusNorm", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<null>", "1.0E-323"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<null>", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"operate", "double[]", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.24999999999999994, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoin...#270#-66865625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.24999999999999997"}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.062499999999999986, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoi...#271#-875521559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.6699999999999999"}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.4488999999999999, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#832206127", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<empty>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:4>", "0.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getDataRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getFrobeniusNorm", "", "2"}, {"getEntry", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getDataRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getFrobeniusNorm", "", "2"}, {"getEntry", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getDataRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getFrobeniusNorm", "", "2"}, {"getEntry", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getDataRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getFrobeniusNorm", "", "2"}, {"getEntry", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"4.2"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=17.64, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-2011710027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0"}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<empty>", "1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:5>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"multiply", "org.apache.commons.math3.linear.RealMatrix", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"power", "int", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "0.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"20.0185"}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=400.74034224999997, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-1885689644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"200.185"}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=40074.034225, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExce...#263#-1856857301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#243009991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"setColumnVector", "int,org.apache.commons.math3.linear.RealVector", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"getColumnVector", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getColumnMatrix", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"getColumnVector", "int", "6"}, {"copy", "", "4"}, {"getLInfDistance", "org.apache.commons.math3.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumnVector", "int", "6"}, {"copy", "", "4"}, {"getLInfDistance", "org.apache.commons.math3.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"getColumnVector", "int", "3"}, {"copy", "", "7"}, {"getMaxValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumnVector", "int", "3"}, {"copy", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumnMatrix", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumnMatrix", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getColumn", "int", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"getColumn", "int", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"walkInRowOrder", "org.apache.commons.math3.linear.RealMatrixChangingVisitor", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 35, new String[][]{}, 1), new String[][]{{"preMultiply", "double[]", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:5>", "-0.002"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "3"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "48.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=2304.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException,...#257#43198214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.1"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.010000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.010000000000000002, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoi...#271#-1223789684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.05"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0025000000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0025000000000000005, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPo...#272#258625831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.05"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0025000000000000005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0025000000000000005, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPo...#272#258625831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:0>", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "2.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"10.0"}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-1492993465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"20.0"}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=400.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-742689628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.5"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.25, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#122494796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getColumnVector", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"scalarMultiply", "double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<empty>", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:5>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:3>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-89664767", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#-90480797", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=2, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1315084789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "10.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-306214392", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.25, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#122494796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#243009991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
}
