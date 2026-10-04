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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:1>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:3>", "<sample:3>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:4>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=10, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1073741824, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741824"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1073741824, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741823"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1073741823, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:4>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:4>", "<sample:4>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:4>", "<sample:4>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:4>", "<sample:2>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"55"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:5>", "<sample:2>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-55"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:5>", "<sample:2>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-46"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-46, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=-1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<empty>"}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:4>", "<sample:3>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:10>", "<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:10>", "<sample:3>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-Infinity, -1.0], getPointRef=[-Infinity, -1.0], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:10>", "<sample:2>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:11>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741825"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1073741825, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=-1073741824, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-1073741824"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1073741824, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-16"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2, getMaxIterations=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-16"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-16}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<null>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:2>", "<empty>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[][]"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1073741824, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483597"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483597, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483610"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483610, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"8"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"38"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-12"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0], getPointRef=[-1.0], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, Infinity, -Infinity], getPointRef=[1.0, Infinity, -Infinity], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0], getPointRef=[0.0, 1.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=5, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:3>", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=2, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=10, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:10>"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<sample:12>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<null>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:6>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:11>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "2"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "6"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=3, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-2147483648, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, false), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false, 1, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>"}, false, 10, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 10, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, false, 10, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:1>", "<sample:6>", "<sample:0>"}, false, 12, new String[][]{}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:4>", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 2), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<null>", "<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 2), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-43"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-43}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-47"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-6"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:7>", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:7>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:2>", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:2>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=6, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:4>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:1>", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=8, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=16, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=16, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=11, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<null>", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:7>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=11, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:8>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=2, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:8>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-3"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:7>", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:7>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:3>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:5>", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=10, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:8>", "<sample:9>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:8>", "<sample:9>", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<empty>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 1), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<empty>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=11, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=11, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:7>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<null>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:7>", "<sample:0>", "<empty>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:6>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "6"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}, {"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:8>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:1>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:6>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:0>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=3, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 2), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:6>", "<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "10"}}), new String[][]{{"getValue", "", "6"}, {"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=10, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.FunctionEvaluationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<null>", "<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "26"}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=26, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "26"}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=26, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:6>", "<empty>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "13"}}), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=13, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:4>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "19"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=19, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "38"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 1.0], getPointRef=[-1.0, 0.0, 1.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=38, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:4>", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "3"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=3, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "2"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", new String[]{"org.apache.commons.math.optimization.RealConvergenceChecker"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:7>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:6>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<null>", "<sample:8>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1, getMaxIterations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "1"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:3>"}}, 3), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:1>", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-18, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-18"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=-18, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-18, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:2>", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=11, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:6>", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=4, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-268435453"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-268435453}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=2, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-22"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-22, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-4194326"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194326", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-4194326, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[][]"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setConvergenceChecker", "org.apache.commons.math.optimization.RealConvergenceChecker", "<sample:4>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=10, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-34"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:4>", "<sample:3>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "6"}}, 2), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEvaluations=10, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:3>", "<sample:8>", "<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<sample:2>"}}, 2), new String[][]{{"getValue", "", "2"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:0>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", new String[]{"double[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "3"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=3, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:2>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "iterateSimplex", "java.util.Comparator", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:7>", "<sample:6>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<empty>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:3>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}}, 2), new String[][]{{"converged", "int,org.apache.commons.math.optimization.RealPointValuePair,org.apache.commons.math.optimization.RealPointValuePair", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.SimpleScalarValueChecker", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluateSimplex", "java.util.Comparator", "<null>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"-1073741810"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-1073741810}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", new String[]{"int"}, new String[]{"1073741753"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=1073741753}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-8192"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-8192}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", "org.apache.commons.math.optimization.RealPointValuePair,java.util.Comparator", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "-16384"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=-16384}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getIterations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxIterations", "int", "32780"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=2147483647, getMaxIterations=32780}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-34"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=-34, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "-34"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setMaxEvaluations", "int", "3"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "setStartConfiguration", "double[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=0, getIterations=0, getMaxEvaluations=3, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", new String[]{"org.apache.commons.math.analysis.MultivariateRealFunction", "org.apache.commons.math.optimization.GoalType", "double[]"}, new String[]{"<sample:7>", "<sample:3>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "getConvergenceChecker", ""}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "getMaxIterations", ""}}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEvaluations=1, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.direct.MultiDirectional", "org.apache.commons.math.optimization.direct.MultiDirectional", "replaceWorstPoint", new String[]{"org.apache.commons.math.optimization.RealPointValuePair", "java.util.Comparator"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.direct.MultiDirectional", "evaluate", "double[]", "<sample:0>"}, {"org.apache.commons.math.optimization.direct.MultiDirectional", "optimize", "org.apache.commons.math.analysis.MultivariateRealFunction,org.apache.commons.math.optimization.GoalType,double[]", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEvaluations=7, getIterations=1, getMaxEvaluations=2147483647, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
}
