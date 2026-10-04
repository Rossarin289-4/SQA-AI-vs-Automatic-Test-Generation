package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"operate", "org.apache.commons.math3.linear.RealVector", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:1>", "-1.0000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-1002464531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"copySubMatrix", "int[],int[],double[][]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"setColumn", "int,double[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getRowMatrix", "int", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"transpose", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<empty>", "NaN"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:3>", "-0.09999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "0.0"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"add", "org.apache.commons.math3.linear.RealMatrix", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "-0.026000000000000002"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.999999999999998"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=99.99999999999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-1361715697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<empty>"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:3>", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#1782480940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"createMatrix", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"setSubMatrix", "double[][],int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{1.0,0.0},{0.0,(Infinity)}} {getColumnDimension=2, getData=[[1.0, 0.0], [0.0, Infinity]], getDataRef=[1.0, Infinity], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathU...#304#-615025064", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getColumnMatrix", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{1.0,0.0},{0.0,(Infinity)}} {getColumnDimension=2, getData=[[1.0, 0.0], [0.0, Infinity]], getDataRef=[1.0, Infinity], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathU...#304#-615025064", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"multiply", "org.apache.commons.math3.linear.DiagonalMatrix", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<null>", "9.999999999999998"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"getColumnDimension", "", "2"}, {"multiplyEntry", "int,int,double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:3>", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "optimize", new String[]{"org.apache.commons.math3.optim.OptimizationData[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "4.9E-324"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyIterationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{0.0,0.0},{0.0,1.0}} {getColumnDimension=2, getData=[[0.0, 0.0], [0.0, 1.0]], getDataRef=[0.0, 1.0], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperati...#282#1106899186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"10.0"}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-604955928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math3.linear.RealMatrixPreservingVisitor", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathUnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"operate", "org.apache.commons.math3.linear.RealVector", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"operateTranspose", "org.apache.commons.math3.linear.RealVector", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<null>", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getEntry", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#1782480940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false), new String[][]{{"getData", "", "2"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[0.0, 0.0], [0.0, 1.0]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"getColumnDimension", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}), new String[][]{{"subtract", "org.apache.commons.math3.linear.DiagonalMatrix", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-6.990000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=48.86010000000002, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-390904464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-2.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("400.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=400.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#145347909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.9999999999999996, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-645397614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getNorm", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTargetSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "incrementEvaluationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.24999999999999994, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoin...#270#-66865625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0000000000000002"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#894443403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:3>", "3.2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#797556740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 1), new String[][]{{"getDataRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.999999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=99.99999999999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-1361715697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"add", "org.apache.commons.math3.linear.RealMatrix", "4"}, {"getColumnVector", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.ArrayRealVector", actual.getClass().getName());
  assertEquals("{} {getDataRef=[], getDimension=0, getL1Norm=0.0, getLInfNorm=0.0, getMaxIndex=-1, getMaxValue=NaN, getMinIndex=-1, getMinValue=NaN, getNorm=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.62"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3844", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.3844, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException,...#257#-2056798614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getRow", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 3), new String[][]{{"setColumnVector", "int,org.apache.commons.math3.linear.RealVector", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:4>", "4.9E-324"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:3>", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "10.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "4.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=16.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#453638950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"createMatrix", "int,int", "6"}, {"setRow", "int,double[]", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=99.99999999999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-1361715697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"walkInOptimizedOrder", "org.apache.commons.math3.linear.RealMatrixChangingVisitor", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-604955928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-2.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=4.000000000000002, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-2025780349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<null>", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", ""}}, 2), new String[][]{{"getColumnVector", "int", "3"}, {"outerProduct", "org.apache.commons.math3.linear.RealVector", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.4"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.16000000000000003, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoin...#270#1653850635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.Weight", "org.apache.commons.math3.optim.nonlinear.vector.Weight", "getWeight", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getData", "", "4"}});
  assertNotNull(actual);
  assertEquals("[[D", actual.getClass().getName());
  assertEquals("[[Infinity]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-604955928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getUpperBound", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-0.1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.010000000000000002, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoi...#271#-1223789684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-0.10000000000000002"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.010000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoi...#271#311606986", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#-1099351194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "4.999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("24.999999999999993", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=24.999999999999993, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-189842586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-1492993465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-4.4942328371557893E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#-1099351194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:2>", "-Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "200.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("40000.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=40000.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException...#258#1325482629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-5.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=25.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#1230160712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "1.7976931348623157E308"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.9999999999999998, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#889999056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.25, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#122494796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<empty>", "-1.0000000000000002"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.005900000000000001"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.481000000000001E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=3.481000000000001E-5, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoi...#271#1788185043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.999999999999998"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("99.99999999999997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=99.99999999999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-1361715697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-10.000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=100.00000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-1691891540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-5.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=25.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#1230160712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"100.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=10000.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException...#258#1838001000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0000000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#1782480940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "2.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=4.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#349706245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-10.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:0>"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}, {"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=100.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-604955928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.9"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=98.01, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#723249739", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "optimize", "org.apache.commons.math3.optim.OptimizationData[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-40161143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-60.99999999999999"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=3720.999999999999, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#1278809839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTargetSize", ""}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.1360000000000001"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.2904960000000003, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#2063736997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<empty>", "-0.9680000000000002"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.000000000000002"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.00000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=100.00000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-1691891540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.43"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}, {"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=108.7849, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#-1683769902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<empty>", "5.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0000000000000002"}}), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#1782480940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-3.7810000000000006"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("14.295961000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=14.295961000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#435675530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:0>"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "1"}, {"converged", "int,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.036"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.073296", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.073296, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#2100970829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-0.25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0625, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException,...#257#910052806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=2, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1816236217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "5.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=25.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#1230160712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-0.5000000000000001"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2500000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.2500000000000001, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-956947221", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-1599686592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-5.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeJacobian", "double[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=25.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, g...#255#1230160712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#581823145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "10.57"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=111.7249, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1270670512", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "5.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=30.25, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ...#256#-50849657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "0.54"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2916", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.2916, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException,...#257#-1826908477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.0000000000000004"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000009, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#-821478329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-0.45800000000000013"}}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.20976400000000012, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoin...#270#-221000286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.017"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0342889999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0342889999999998, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#700411088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-0.42000000000000004"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.17640000000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.17640000000000003, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoin...#270#-2011237942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "-Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "9.999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=99.99999999999997, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointe...#268#-1361715697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1131047528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:2>", "-4.9E-324"}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0000000000000002"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#1782480940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getMaxIterations", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerExceptio...#259#1685594277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementIterationCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=0, getIterations=1, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#1469860682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "setCost", "double", "18.6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("345.96000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=345.96000000000004, getEvaluations=0, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPoint...#269#894295986", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "incrementEvaluationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getEvaluations=1, getIterations=0, getLowerBound=null, getMaxEvaluations=0, getMaxIterations=0, getRMS=!NullPointerException, getStartPoint=null, getTarget=!NullPointerException, ge...#254#-928198680", SearchInputFactory_scaffolding.receiverState());
 }
}
