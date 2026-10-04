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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-67108863", "<null>", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<empty>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-134217675", "<sample:2>", "<sample:8>", "<sample:8>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:4>", "<sample:13>", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"65535", "<sample:1>", "<sample:4>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.PointVectorValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=[0.0, 1.0], getValueRef=[0.0, 1.0]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=[[NaN]], getEvaluations=2, getJacobianEvaluations=3, getMaxEvaluations=65535, getRMS=NaN, getStartPoint=[-1.0], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "65577", "<sample:4>", "<sample:3>", "<sample:9>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{(NaN)}} {getColumnDimension=1, getData=[[NaN]], getDataRef=[NaN], getFrobeniusNorm=!MathUnsupportedOperationException, getNorm=!MathUnsupportedOperationException, getRowDimension=1, ge...#248#-2037386557", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!DimensionMismatchException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=65577, getRMS=0.0, getStartPoint=[-1.0], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-5", "<sample:3>", "<sample:1>", "<sample:0>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"2", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:11>", "<sample:5>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-11", "<sample:7>", "<sample:2>", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<empty>", "-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "11", "<sample:6>", "<sample:8>", "<sample:7>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=11, getRMS=NaN, getStartPoint=[Infinity, -Infinity, -1.0], getTarget=[Infinity, -...#216#222111544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:4>", "2.0E-14"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"510", "<sample:5>", "<sample:7>", "<null>", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:7>", "1.0"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2046", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-2097150", "<sample:5>", "<empty>", "<empty>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:0>", "-10.0"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<null>", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "5", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=5, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#776917695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-246", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:6>", "1.006"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "10", "<sample:0>", "<sample:5>", "<sample:8>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=[0.0, 1.0], getTarget=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1073741823", "<sample:8>", "<sample:7>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-268434943", "<sample:1>", "<sample:0>", "<empty>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:8>", "47.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:1>", "<sample:2>", "<sample:8>", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=0.0, getStartPoint=[Infinity, -Infinity, -1.0], getTarget=[1....#224#1603467074", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-67108871", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:7>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTarget", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:8>", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-134217738", "<sample:7>", "<sample:6>", "<sample:2>", "<sample:6>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "1", "<sample:4>", "<sample:5>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#240212291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:1>", "2.0E-14"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:5>", "1.7976931348623158E307"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-24", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-67043318", "<sample:8>", "<sample:6>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147450880", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:4>", "<sample:8>", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-4.9E-323"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-268435413", "<sample:11>", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3), new String[][]{{"value", "double[]", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-268435413, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[-1.0, 0.0, 1.0]...#201#-987210299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-12", "<sample:5>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-12, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcep...#205#1230680006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 3), new String[][]{{"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"6", "<sample:4>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"33554430", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-268435452", "<sample:2>", "<sample:4>", "<null>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"10.0"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"134217727", "<sample:5>", "<sample:8>", "<sample:2>", "<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-268435455", "<sample:0>", "<sample:2>", "<empty>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"2.0E-14"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=4.0E-28, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-314312805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-134217727", "<sample:7>", "<sample:2>", "<sample:4>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "1.0"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"63", "<sample:7>", "<empty>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "NaN"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"2097150", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-2147483648", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:1>", "<sample:7>", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "guessParametersErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"2147483647", "<sample:0>", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:4>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:3>", "<empty>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCovariances", new String[]{"double[]", "double"}, new String[]{"<sample:4>", "35.00000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:1>", "<sample:2>", "<sample:0>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:3>", "<sample:7>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:5>", "<sample:9>", "<sample:4>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "0", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<null>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:0>", "<sample:1>", "<sample:4>", "<sample:5>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:1>", "1.006"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:2>", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-1", "<null>", "<sample:0>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:8>", "<sample:2>", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"2147483647", "<sample:3>", "<sample:4>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "10", "<sample:8>", "<null>", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"1.0059999999999998"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=1.0120359999999995, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget...#223#2065422071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "67108863", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=67108863, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:0>", "-1.7976931348623155E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "0", "<sample:0>", "<sample:0>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "10", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=[-1.0], getTarget=[-Infinity, -1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:8>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:4>", "<sample:5>", "<sample:2>", "<sample:7>"}}), new String[][]{{"getRelativeThreshold", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:3>", "<sample:5>", "<sample:8>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "65", "<sample:2>", "<sample:3>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=65, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1591014072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "0.1006"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=3, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-849264410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "1", "<sample:1>", "<sample:9>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=1, getRMS=NaN, getStartPoint=[0.0], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=3, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-849264410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-268435455", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-268435455, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-1564309773", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-10", "<sample:6>", "<sample:3>", "<sample:0>", "<empty>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "5", "<sample:5>", "<sample:2>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=5, getRMS=NaN, getStartPoint=[0.0, 1.0], getTarget=[1.0, Infinity, -Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "10", "<sample:5>", "<null>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-1", "<sample:3>", "<sample:2>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:7>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=2, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1512578458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "10", "<sample:8>", "<sample:2>", "<sample:9>", "<sample:6>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{"double"}, new String[]{"-8.988465674311578E307"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "8191", "<sample:2>", "<sample:1>", "<sample:7>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#246308750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"33554433", "<null>", "<null>", "<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<null>", "<sample:7>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}), new String[][]{{"getAbsoluteThreshold", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=NaN, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#347049675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-135266258", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-135266258, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-1181864529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:3>", "<sample:5>", "<empty>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}), new String[][]{{"getRelativeThreshold", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[1.0, Infinity, -Infinity], getTarget=[-1.0...#212#-446054963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:7>", "<sample:5>", "<sample:1>", "<sample:8>"}}), new String[][]{{"value", "double[]", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[Infinity, -Infinity, -1.0], getTarget=[-1....#213#727660718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeCost", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "10", "<sample:2>", "<sample:10>", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "16394", "<sample:6>", "<sample:4>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-134217726", "<sample:0>", "<sample:9>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-134217726, getRMS=NaN, getStartPoint=[-1.0, 0.0, 1.0], getTarget=[-Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#1453224697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:7>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2", "<null>", "<empty>"}}), new String[][]{{"getAbsoluteThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#1448130466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"40", "<sample:4>", "<sample:7>", "<sample:7>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-268435454", "<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:0>", "<sample:8>", "<sample:6>", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-1", "<sample:6>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeObjectiveValue", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "40", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "0.045000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0020250000000000897, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTar...#226#-389643128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"40", "<sample:3>", "<sample:7>", "<sample:8>", "<sample:4>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "15", "<sample:3>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=15, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1097119020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "guessParametersErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-134217723", "<sample:1>", "<sample:1>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:4>", "<null>", "<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-67108863", "<sample:2>", "<sample:4>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-67108863, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[-Infinity, -1....#203#-1484977174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "16777176", "<sample:8>", "<sample:10>", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "-1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "40", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=40, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#2120465276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:5>", "<sample:3>", "<sample:7>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"20", "<null>", "<sample:7>", "<sample:1>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"40", "<sample:4>", "<sample:1>", "<sample:4>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"36", "<null>", "<sample:5>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTarget", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2", "<sample:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#1448130466", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"10", "<sample:1>", "<sample:1>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "0", "<sample:8>", "<null>", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-65526", "<sample:7>", "<sample:5>", "<sample:2>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}}), new String[][]{{"getAbsoluteThreshold", "", "3"}, {"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:10>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "0", "<sample:3>", "<sample:1>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{-1.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,1.0}} {getColumnDimension=3, getData=[[-1.0, 0.0, 0.0], [0.0, 0.0, 0.0], [0.0, 0.0, 1.0]], getDataRef=[-1.0, 0.0, 1.0], getFrobeniusNorm=!MathUnsup...#339#-1416752651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483648", "<sample:4>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1392270650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623155E307"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "7"}, {"converged", "int,java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.optimization.SimpleVectorValueChecker", actual.getClass().getName());
  assertEquals("{getAbsoluteThreshold=2.2250738585072014E-306, getRelativeThreshold=1.1102230246251565E-14}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-12", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{1.0,0.0,0.0},{0.0,(Infinity),0.0},{0.0,0.0,(NaN)}} {getColumnDimension=3, getData=[[1.0, 0.0, 0.0], [0.0, Infinity, 0.0], [0.0, 0.0, NaN]], getDataRef=[1.0, Infinity, NaN], getFrobeniu...#355#-724041301", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-12, getRMS=0.0, getStartPoint=[0.0, 1.0], getTarget=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "8191", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=8191, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExce...#206#-1945892985", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"0", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"0.5029999999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getStartPoint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.2530089999999999, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget...#223#-845200117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-1073741824", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2147483648", "<sample:5>", "<sample:5>", "<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getJacobianEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-22", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "2147483647", "<sample:0>", "<empty>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"1", "<null>", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeResiduals", "double[]", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-67108799", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "2"}, {"converged", "int,java.lang.Object,java.lang.Object", "0"}, {"converged", "int,java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-67108799, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointe...#211#2110543208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-5", "<sample:4>", "<sample:9>", "<null>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"16384", "<null>", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "67092479", "<sample:2>", "<sample:2>", "<empty>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "40", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=40, getRMS=NaN, getStartPoint=[1.0, Infinity, -Infinity], getTarget=[-Infinity, -...#205#-830375367", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "67108863", "<sample:7>", "<sample:8>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67108863", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=67108863, getRMS=0.0, getStartPoint=[0.0, 1.0], getTarget=[Infinity, -I...#215#1951947056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<sample:0>", "<empty>", "<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-134184959", "<sample:2>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-134184959, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-1348089469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "1.0000000000000002"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=1.0000000000000004, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget...#223#-648404208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "5", "<sample:1>", "<sample:3>", "<sample:7>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=5, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[Infinity]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "0", "<sample:5>", "<sample:3>", "<sample:3>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", "double", "0.5029999999999999"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "10", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeWeightedJacobian", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:0>", "<sample:2>", "<sample:3>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"converged", "int,org.apache.commons.math3.optimization.PointVectorValuePair,org.apache.commons.math3.optimization.PointVectorValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:0>", "<sample:7>", "<sample:4>", "<sample:5>"}}, 2), new String[][]{{"getAbsoluteThreshold", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.2250738585072014E-306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-2", "<null>", "<sample:4>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRelativeThreshold", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getCovariances", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-134217684", "<null>", "<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeWeightedJacobian", "double[]", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "double[]", "double[]", "double[]"}, new String[]{"-536739830", "<sample:2>", "<empty>", "<empty>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "2147483647", "<sample:6>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#-843252276", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimize", new String[]{"int", "org.apache.commons.math3.analysis.MultivariateVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"40", "<sample:0>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "1", "<sample:6>", "<sample:4>", "<empty>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCost", "double[]", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setCost", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=Infinity, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#1228029769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-268435454", "<null>", "<sample:4>", "<sample:4>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435454", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-268435454, getRMS=0.0, getStartPoint=[1.0, Infinity, -Infinity], getTarget=[-Inf...#213#-753274695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getChiSquare", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:0>", "<sample:4>", "<sample:7>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[0.0, 1.0, Infinity], getTarget=[-Infinity,...#207#767661042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:6>", "<sample:1>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, 2.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=NaN, getStartPoint=[1.0, Infinity, -Infinity], getTarget=[0.0,...#206#-686590861", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1240142171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-2147483616", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483616", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483616, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoin...#213#-1690806279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getObjectiveFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-134217611", "<sample:4>", "<sample:0>", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-134217611, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "52", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=52, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-967907909", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "doOptimize", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.0, -Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!DimensionMismatchException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=0.0, getStartPoint=[1.0, Infinity], getTarget=[-1.0, 0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "10", "<sample:4>", "<sample:0>", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=NaN, getStartPoint=[1.0, Infinity], getTarget=[-1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setUp", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeSigma", "double[],double", "<sample:5>", "NaN"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1180921434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "13", "<null>", "<sample:1>", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=13, getRMS=NaN, getStartPoint=[-Infinity, -1.0], getTarget=[0.0, 1.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-2, getRMS=0.0, getStartPoint=[0.0, 1.0], getTarget=[1.0, Infinity, -In...#208#-1726756883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "setUp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeightSquareRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:7>", "Infinity"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:1>", "<sample:10>", "<sample:4>", "<sample:0>"}}), new String[][]{{"power", "int", "2"}, {"walkInColumnOrder", "org.apache.commons.math3.linear.RealMatrixPreservingVisitor", "5"}, {"getSubMatrix", "int[],int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeResiduals", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-536870654", "<null>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getRMS", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870654", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-536870654, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPoint...#212#637543593", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "computeSigma", new String[]{"double[]", "double"}, new String[]{"<sample:9>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:0>", "2.0000000000000004"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getObjectiveFunction", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getTargetRef", ""}}, 2), new String[][]{{"getRelativeThreshold", "", "7"}, {"getRelativeThreshold", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1102230246251565E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-967705884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:5>"}}), new String[][]{{"setColumn", "int,double[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "setCost", "double", "10.060000000000002"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=101.20360000000005, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=0, getRMS=Infinity, getStartPoint=!NullPointerException, getTarget...#223#-7563857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getChiSquare", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.MultivariateVectorFunction,double[],double[],double[]", "-1073741824", "<sample:3>", "<sample:1>", "<sample:7>", "<sample:2>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightRef", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1073741824, getRMS=NaN, getStartPoint=[1.0, Infinity, -Infinity], getTarget=[0.0...#207#-1319308531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-58", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-58, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcep...#205#-653747196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateJacobian", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=1, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-1180921434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "10", "<sample:3>", "<sample:8>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!DimensionMismatchException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=10, getRMS=0.0, getStartPoint=[Infinity], getTarget=[Infinity, -Infinity, -...#205#363207236", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"-10", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,double[],double[],double[]", "-67108863", "<sample:1>", "<sample:8>", "<sample:11>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.TooManyEvaluationsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getRMS", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2147483648", "<sample:2>", "<sample:3>", "<sample:8>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-2147483648, getRMS=NaN, getStartPoint=[Infinity, -Infinity, -1.0], getTarget=[In...#208#946375265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getTargetRef", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimizeInternal", "int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[]", "-1", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcept...#204#-1091822764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "optimizeInternal", new String[]{"int", "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction", "org.apache.commons.math3.optimization.OptimizationData[]"}, new String[]{"8179", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeObjectiveValue", "double[]", "<sample:0>"}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-2", "<sample:4>", "<sample:1>", "<sample:3>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "2147483647", "<sample:3>", "<sample:1>", "<sample:13>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.linear.DiagonalMatrix", actual.getClass().getName());
  assertEquals("DiagonalMatrix{{(Infinity),0.0},{0.0,(-Infinity)}} {getColumnDimension=2, getData=[[Infinity, 0.0], [0.0, -Infinity]], getDataRef=[Infinity, -Infinity], getFrobeniusNorm=!MathUnsupportedOperationExcep...#319#-602272210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=2147483647, getRMS=0.0, getStartPoint=[1.0, Infinity, -Infinity], getTa...#216#1131933958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getWeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-24", "<sample:4>", "<sample:3>", "<sample:9>", "<sample:0>"}}), new String[][]{{"add", "org.apache.commons.math3.linear.RealMatrix", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.linear.MatrixDimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getStartPoint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "getWeightSquareRoot", ""}, {"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "optimize", "int,org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction,double[],double[],double[]", "-1", "<sample:7>", "<sample:6>", "<sample:0>", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!ArrayIndexOutOfBoundsException, getEvaluations=1, getJacobianEvaluations=1, getMaxEvaluations=-1, getRMS=0.0, getStartPoint=[-1.0, 0.0], getTarget=[0.0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer", "getConvergenceChecker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "computeCovariances", "double[],double", "<sample:2>", "1.7976931348623157E308"}}, 3), new String[][]{{"converged", "int,java.lang.Object,java.lang.Object", "6"}, {"converged", "int,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getChiSquare=0.0, getCovariances=!NullPointerException, getEvaluations=0, getJacobianEvaluations=2, getMaxEvaluations=0, getRMS=NaN, getStartPoint=!NullPointerException, getTarget=!NullPointerExcepti...#203#-908485147", SearchInputFactory_scaffolding.receiverState());
 }
}
