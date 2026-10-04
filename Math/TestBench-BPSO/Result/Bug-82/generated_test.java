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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<sample:0>", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2097162"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:3>", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:6>", "false"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "true"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<sample:3>", "<sample:8>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<null>", "<sample:0>", "<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-54"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741814"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741814", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1073741814}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<sample:0>", "<sample:3>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:9>", "<empty>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:3>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "59"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<sample:2>", "<sample:7>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"36"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2092"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2092}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"19"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:4>", "<null>", "<sample:9>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "59"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "131126"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=131126}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:5>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"51"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:2>", "<null>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "524287"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("524287", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=524287}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:10>", "<empty>", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:6>", "false"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "36"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:3>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:9>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:1>", "<sample:0>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:3>", "true"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:0>", "<sample:1>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483644"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483644}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "8388607"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=8388607}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-16777206"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"8212"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=8212}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:7>", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"57"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=57}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<null>", "<sample:3>", "<sample:3>", "true"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"256"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=256}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-8172"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8172", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-8172}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:7>", "false"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "32769"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=32769}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 1), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:7>", "true"}, false), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483605"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483605}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2130706431"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2130706431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:13>", "<empty>", "<sample:10>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<null>", "true"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, -0.0], getPointRef=[0.0, -0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:3>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:5>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:5>", "<empty>", "<sample:8>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "36"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"223"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=223}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:5>", "false"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-10"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:4>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:2>", "<sample:9>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:11>", "<empty>", "<sample:5>", "false"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "41"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:10>", "<sample:2>", "<null>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:11>", "<empty>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741842"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1073741842}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:3>", "true"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-65"}}, 1), new String[][]{{"getPoint", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-50"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:4>", "<empty>", "<sample:6>", "true"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 0.0], getPointRef=[-1.0, 0.0, 0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:8>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<null>", "<null>", "<sample:6>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:1>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1024"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1024}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:1>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:8>", "<sample:1>", "<sample:2>", "true"}}, 3), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:7>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:2>", "true"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 2), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-268435455"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435455", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-268435455}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741767"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741767}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:5>", "true"}}), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "76"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=76}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:5>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-75", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "805306368"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("805306368", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=805306368}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-30"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:3>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "28"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:7>", "false"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:10>", "<empty>", "<sample:8>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:1>", "<empty>", "<sample:2>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "134217738"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217738", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=134217738}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147475456"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147475456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147475456}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:10>", "<empty>", "<null>", "true"}}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:3>", "false"}}), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:9>", "<empty>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "32760"}}, 3), new String[][]{{"getValue", "", "3"}, {"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=32760}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:5>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 3), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "13"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:0>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:11>", "<empty>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-36"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[], getPointRef=[], getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-36}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<null>", "false"}}, 3), new String[][]{{"getPoint", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-13"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "4137"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4137", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=4137}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:6>", "false"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-49"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:9>", "<empty>", "<sample:6>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:1>", "<empty>", "<sample:7>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:9>", "<empty>", "<sample:1>", "false"}}), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2146435071"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2146435071}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2145386496"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2145386496}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:4>", "false"}}, 1), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:0>", "<empty>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 3), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:8>", "<empty>", "<sample:6>", "true"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:11>", "<empty>", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:0>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:10>", "true"}}, 2), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:13>", "<empty>", "<sample:0>", "true"}}, 1), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:3>", "true"}}, 1), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:0>", "<empty>", "<sample:5>", "true"}}, 1), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:9>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 2), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:9>", "<empty>", "<sample:0>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 3), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:10>", "<sample:0>", "<sample:6>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:2>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
}
