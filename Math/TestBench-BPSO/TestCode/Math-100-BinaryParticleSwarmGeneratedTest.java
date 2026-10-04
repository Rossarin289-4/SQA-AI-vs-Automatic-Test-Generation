package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:8>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-536870912"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "2147483647"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getRMS", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getRMS", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:9>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:11>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getRMS", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getRMS", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "2147483647"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "2147483647"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getRMS", "org.apache.commons.math.estimation.EstimationProblem", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-19"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:5>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.estimation.EstimationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:1>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "1073741823"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "estimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "guessParametersErrors", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:9>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:1>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:10>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:9>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCovariances", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "incrementJacobianEvaluationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"1073741823"}, false, 6, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "guessParametersErrors", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getChiSquare", "org.apache.commons.math.estimation.EstimationProblem", "<sample:1>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:13>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "initializeEstimate", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=3, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCostEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getJacobianEvaluations", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "initializeEstimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateResidualsAndCost", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "setMaxCostEval", "int", "1"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:1>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "setMaxCostEval", new String[]{"int"}, new String[]{"45"}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getJacobianEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=1, getJacobianEvaluations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "updateJacobian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:0>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getCostEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateResidualsAndCost", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=2, getJacobianEvaluations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getRMS", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:6>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "getCovariances", "org.apache.commons.math.estimation.EstimationProblem", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "estimate", "org.apache.commons.math.estimation.EstimationProblem", "<sample:4>"}, {"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.estimation.AbstractEstimator", "org.apache.commons.math.estimation.GaussNewtonEstimator", "getChiSquare", new String[]{"org.apache.commons.math.estimation.EstimationProblem"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.estimation.AbstractEstimator", "updateJacobian", ""}, {"org.apache.commons.math.estimation.AbstractEstimator", "incrementJacobianEvaluationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCostEvaluations=0, getJacobianEvaluations=2}", SearchInputFactory_scaffolding.receiverState());
 }
}
