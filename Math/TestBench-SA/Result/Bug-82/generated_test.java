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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:0>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:0>", "<sample:2>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147479551"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147479551}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147446783"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147446783}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483647"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:0>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:0>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741824"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:0>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741824"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:0>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741824"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:3>", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-63"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<null>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, -0.0], getPointRef=[0.0, -0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, -0.0], getPointRef=[0.0, -0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:3>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<null>", "true"}, false), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:5>", "false"}, false, 3, new String[][]{}), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:3>", "false"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:4>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1), new String[][]{{"getValue", "", "2"}, {"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "<sample:5>", "true"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741824"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<null>", "<sample:1>", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<null>", "<sample:1>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:1>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:4>", "<empty>", "<sample:1>", "false"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 0.0], getPointRef=[-1.0, 0.0, 0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:4>", "<empty>", "<sample:1>", "true"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0, 1.0, 0.0], getPointRef=[0.0, 1.0, 0.0], getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:3>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-14"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:3>", "<sample:3>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-18"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:8>", "<empty>", "<sample:7>", "false"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:8>", "<empty>", "<sample:7>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:8>", "<empty>", "<sample:7>", "true"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:6>", "true"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:5>", "<empty>", "<sample:6>", "true"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "33554431"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554431", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=33554431}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<sample:1>", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<sample:1>", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<sample:3>", "<sample:6>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2143289344"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2143289344", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2143289344}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<sample:0>", "<sample:3>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<null>", "<sample:4>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<null>", "<sample:3>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:5>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<null>", "<null>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:4>", "<empty>", "<sample:0>", "false"}, false, 3, new String[][]{}, 3), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<empty>", "<sample:6>", "true"}, false, 0, null, 2), new String[][]{{"getPoint", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:1>", "true"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:2>", "true"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 2), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:3>", "true"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:0>", "<empty>", "<sample:1>", "true"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:2>", "true"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", new String[]{"int"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:3>", "<null>", "<sample:6>", "false"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:5>", "true"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:10>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:4>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:1>", "<empty>", "<sample:4>", "true"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:5>", "true"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<sample:2>", "<null>", "true"}}, 1), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:7>", "<empty>", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 3), new String[][]{{"getPointRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:5>", "<empty>", "<sample:3>", "false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20971547"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[0.0], getPointRef=[0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20971547}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:3>", "true"}, false, 15, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "20971541"}}, 2), new String[][]{{"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=20971541}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<null>", "true"}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:2>", "<sample:8>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 1), new String[][]{{"getPoint", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:5>", "<empty>", "<sample:0>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:5>", "<empty>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "5"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 3), new String[][]{{"getPoint", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-0.0], getPointRef=[-0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}), new String[][]{{"getValue", "", "0"}, {"getPointRef", "", "6"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:0>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:5>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}), new String[][]{{"getValue", "", "0"}, {"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:2>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:2>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:2>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 1), new String[][]{{"getValue", "", "0"}, {"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:4>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<empty>", "<sample:4>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 1), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<sample:0>", "<sample:1>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:4>", "false"}}, 1), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:4>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}), new String[][]{{"getPointRef", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:7>", "false"}}, 2), new String[][]{{"getPointRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:1>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.linear.UnboundedSolutionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:1>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<sample:2>", "<sample:1>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:1>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3), new String[][]{{"getPointRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:1>", "<empty>", "<sample:1>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:4>", "false"}}, 3), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:4>", "false"}}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483646"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:4>", "false"}}), new String[][]{{"getValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483646}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:4>", "true"}}, 1), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:4>", "true"}}, 2), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:4>", "true"}}, 2), new String[][]{{"getValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:1>", "<null>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0, 0.0], getPointRef=[-1.0, 0.0, 0.0], getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<sample:0>", "<sample:2>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[1.0, 0.0, 0.0], getPointRef=[1.0, 0.0, 0.0], getValue=-2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<sample:0>", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<null>", "<sample:5>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:5>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[NaN], getPointRef=[NaN], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:2>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:2>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}}, 2), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:2>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483597"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 2), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483597}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:4>", "true"}}, 2), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:4>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 3), new String[][]{{"getPointRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:4>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}}, 2), new String[][]{{"getPointRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:4>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[Infinity], getPointRef=[Infinity], getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:10>", "<empty>", "<null>", "true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:3>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1), new String[][]{{"getValue", "", "1"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:3>", "<empty>", "<sample:6>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741823"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:0>", "<empty>", "<sample:1>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:5>", "true"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2"}}, 2), new String[][]{{"getPointRef", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:6>", "<empty>", "<sample:7>", "true"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:4>", "<empty>", "<sample:6>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1073741844"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}}, 1), new String[][]{{"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1073741844}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "28"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=28}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-53"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", new String[]{"org.apache.commons.math.optimization.linear.SimplexTableau"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-53"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1073741824"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-4194305"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483633"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483633", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483633}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:7>", "<empty>", "<sample:5>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:5>", "<sample:3>", "<sample:4>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-29"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.optimization.OptimizationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "solvePhase1", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "2147483625"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483625", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=2147483625}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<null>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-50"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:1>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", new String[]{"org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "java.util.Collection", "org.apache.commons.math.optimization.GoalType", "boolean"}, new String[]{"<sample:2>", "<empty>", "<sample:6>", "true"}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}}, 3), new String[][]{{"getPoint", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:0>", "<empty>", "<sample:5>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:0>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-491"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-491", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=-491}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-1"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=-1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "-17"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:2>", "<empty>", "<sample:6>", "false"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getMaxIterations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "10"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "isOptimal", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "getIterations", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "incrementIterationsCounter", ""}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getIterations=3, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}}, 3), new String[][]{{"getPoint", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=2, getMaxIterations=100}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:6>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.optimization.RealPointValuePair", actual.getClass().getName());
  assertEquals("{getPoint=[-1.0, 0.0], getPointRef=[-1.0, 0.0], getValue=NaN}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "doIteration", "org.apache.commons.math.optimization.linear.SimplexTableau", "<sample:4>"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=1, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexSolver", "org.apache.commons.math.optimization.linear.SimplexSolver", "doOptimize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexSolver", "optimize", "org.apache.commons.math.optimization.linear.LinearObjectiveFunction,java.util.Collection,org.apache.commons.math.optimization.GoalType,boolean", "<sample:6>", "<empty>", "<sample:7>", "true"}, {"org.apache.commons.math.optimization.linear.SimplexSolver", "setMaxIterations", "int", "0"}}, 1), new String[][]{{"getPoint", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getIterations=0, getMaxIterations=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
